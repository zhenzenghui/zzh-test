package src.main.java.com.zzh.concurrent.collection_pool_example;

import java.sql.Connection;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author zzh
 * @date 2019/7/5
 */
public class ConnectionPoolTest {

    //创建并初始化连接池
    static ConnectionPool connectionPool = new ConnectionPool(1);
    //保证所有ConnectionRunner能够同时开始
    static CountDownLatch start = new CountDownLatch(1);
    //main线程会等待多有ConnectionRunner线程执行完成之后再执行
    static CountDownLatch end ;

    public static void main(String[] args) throws Exception{
        //线程数量，可以修改观察
        int threadCount = 1;
        end = new CountDownLatch(threadCount);
        int count = 1;
        AtomicInteger got = new AtomicInteger();
        AtomicInteger notgot = new AtomicInteger();
        for (int i=0; i<threadCount; i++) {
            Thread thread = new Thread(new ConnectionRunner(count, got , notgot), "ConnectionRunnerThread");
            thread.start();
        }
        start.countDown();
        end.await();
        System.out.println("total invoke: " + (threadCount * count));
        System.out.println("got connection : " + got);
        System.out.println("notgot connection :" + notgot);
    }

    static class ConnectionRunner implements Runnable {
        int count;
        AtomicInteger got;
        AtomicInteger notgot;

        public ConnectionRunner(int count, AtomicInteger got, AtomicInteger notgot) {
            this.count = count;
            this.got = got;
            this.notgot = notgot;
        }

        @Override
        public void run() {
            try {
                start.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            while (count > 0) {
                //从线程池获取连接，如果1000ms内无法获取到，则返回null
                //分别统计连接获取的数量和未获取的数量
                try {
                    Connection connection = connectionPool.fetchConnection(1000);
                    System.out.println("connection:" + connection.toString());
                    if (connection != null) {
                        try {
                            connection.createStatement();
                            connection.commit();
                        } finally {
                            connectionPool.releaseConnection(connection);
                            got.incrementAndGet();
                        }
                    }else {
                        notgot.incrementAndGet();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }finally {
                    count --;
                }
            }
            end.countDown();
        }

    }

}
