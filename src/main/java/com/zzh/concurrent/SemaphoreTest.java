package src.main.java.com.zzh.concurrent;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

/**
 * Semphore信号量用法，用于做流量控制
 * 30个线程，但是Semaphore只允许10个并发执行。Semaphore的构造方法Semaphore(int permits)接受一个整形的数字，表示可用的许可证数量，
 * 也就是最大的并发数。 首先使用Semaphore的acquire()方法获取一个许可证，使用完之后调用Semaphore的release()方法归还许可证。
 *
 * @author zzh
 * @date 2019/2/11
 */
public class SemaphoreTest {

    private static final int THREAD_COUNT = 30;

    private static ExecutorService threadPool = Executors.newFixedThreadPool(THREAD_COUNT);

    private static Semaphore semaphore = new Semaphore(10);

    public static void main(String[] args) {
        for (int i=0; i<30; i++){
            threadPool.execute(new Runnable() {
                @Override
                public void run() {

                    try {
                        semaphore.acquire();
                        System.out.println(Thread.currentThread() + "  save data");
                        semaphore.release();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
            });
        }
        threadPool.shutdown();
    }

}
