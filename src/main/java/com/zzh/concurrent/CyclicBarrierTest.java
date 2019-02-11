package src.main.java.com.zzh.concurrent;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.TimeUnit;

/**
 * CyclicBarrier 同步屏障 够着方法中传入的是屏障拦截的线程数目，每个线程调用await()方法的高数CyclicBarrier已经到达屏障，然后当前线程被阻塞。
 * 直到达到 设置的屏障拦截的线程数目 所有线程才开始向下执行
 * @author zzh
 * @date 2019/2/4
 */
public class CyclicBarrierTest {

    static CyclicBarrier cyclicBarrier = new CyclicBarrier(2);

    public static void main(String[] args) throws BrokenBarrierException, InterruptedException {

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("before --->  1-1");
                try {
                    TimeUnit.SECONDS.sleep(2);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                try {
                    cyclicBarrier.await();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                System.out.println("after ----> 1-2");
            }
        }).start();

        System.out.println("before ---> 2-1");
        TimeUnit.SECONDS.sleep(5);
        cyclicBarrier.await();
        System.out.println("before ---> 2-2");

    }

}
