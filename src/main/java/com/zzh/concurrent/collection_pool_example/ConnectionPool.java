package src.main.java.com.zzh.concurrent.collection_pool_example;

import java.sql.Connection;
import java.util.LinkedList;

/**
 * @author zzh
 * @date 2019/7/5
 */

/**
 * 连接池通过构造方法初始化连接的最大上限，通过一个双向队列类维护。
 * 调用方首先调用fetchConnection(long ll) 方法类指定在多少毫秒内超时获取连接
 * 当连接使用完之后，调用releaseConnection(Connenction connetion) 方法将连接放回连接池
 */
public class ConnectionPool {

    //创建连接词
    private LinkedList<Connection> pool = new LinkedList<>();

    //初始化连接池
    public ConnectionPool(int initialSize){
        if (initialSize > 0){
            for (int i=0; i<initialSize; i++){
                pool.addLast(ConnectionDriver.createConnection());
            }
        }
    }

    //释放连接，归还到连接池
    public void releaseConnection(Connection connection){
        if (connection != null){
            synchronized (pool) {
                //连接释放后需要进行通知，这样其他消费者就能感知到连接池中已经归还了一个连接
                pool.addLast(connection);
                pool.notifyAll();
            }
        }
    }

    //在mills内无法获取到连接，则会返回null
    public Connection fetchConnection(long mills) throws InterruptedException {
        synchronized (pool) {
            //完全超时
            if (mills <= 0){
                while (pool.isEmpty()) {
                    pool.wait();
                }
                return pool.removeFirst();
            }else {
                long future = System.currentTimeMillis() + mills;
                long remaining = mills;
                if (pool.isEmpty() && remaining > 0){
                    pool.wait(remaining);
                    remaining = future - System.currentTimeMillis();
                }
                Connection result = null;
                if (!pool.isEmpty()){
                    result = pool.removeFirst();
                }
                System.out.println(result.toString());
                return result;
            }
        }
    }


}
