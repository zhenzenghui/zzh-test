package src.main.java.com.zzh.concurrent;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/**
 * CountDownLatch 的构造器接收一个int型的参数作为计数器，如果想等待N个点完成，就传入N。
 * 调用CountDownLatch的countDown()的方法时，计数器减一；CountDownLatch的await()方法会阻塞当前线程，直到计数器N等于0。
 * await(long time, TimeUnite unit)方法可以设置过期时间，可以不让主线程等待 处理时间超过过期时间 的线程
 * @author zzh
 * @date 2019/2/4
 */
public class CountDownLatchTest {

    static CountDownLatch c = new CountDownLatch(2);

    public static void main(String[] args) throws Exception {
        new Thread(() -> {
            System.out.println(1);
            c.countDown();
            //System.out.println(2);
            //c.countDown();
        }).start();
        new Thread(() -> {
            //System.out.println(1);
            //c.countDown();
            try {
                TimeUnit.SECONDS.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(2);
            c.countDown();
        }).start();
        c.await();
        c.await(3, TimeUnit.SECONDS);
        System.out.println("3");
    }

}
