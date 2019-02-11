package src.main.java.com.zzh.concurrent;

/**
 * join 方法让当前线程等待join线程执行结束
 * @author zzh
 * @date 2019/2/4
 */
public class JoinCountDownLatchTest {

    public static void main(String[] args) throws InterruptedException {

        Thread thread1 = new Thread(() -> System.out.println("thread1 ... "));

        Thread thread2 = new Thread(() -> System.out.println("thread2 ..."));

        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println("thread main finish...");

    }

}
