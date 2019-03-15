package src.main.java.com.zzh.concurrent.four;

import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * wait  notify
 *
 * @author zzh
 * @date 2019/3/15
 */
public class WaitNotifyTest {

    static boolean flag = true;
    static Object lock = new Object();

    static SimpleDateFormat sm = new SimpleDateFormat("HH:mm:ss");

    public static void main(String[] args) throws InterruptedException {

        Thread waitThread = new Thread(new Wait(), "WaitThread");
        waitThread.start();

        TimeUnit.SECONDS.sleep(1);

        Thread notifyThread = new Thread(new Notify(), "NotifyThread");
        notifyThread.start();

    }


    static class Wait implements Runnable{

        @Override
        public void run() {
            //加锁，拥有lock的Monitor
            synchronized (lock){
                //当条件不满足时，继续wait,同时释放lock的锁。   wait会释放锁
                while (flag){
                    try {
                        System.out.println(Thread.currentThread() + " flag is true. wait@ " + sm.format(new Date()));
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                //条件满足时，完成工作
                //do something
                System.out.println(Thread.currentThread() + " flag is false. wait@ " + sm.format(new Date()));
            }
        }
    }


    static class Notify implements Runnable{

        @Override
        public void run() {
            //加锁，拥有lock 的Monitor
            synchronized(lock){
                //获取lock锁，然后进行通知，通知的时候不会释放lock锁
                //直到当前线程释放lock锁后，WaitThread才能从wait方法中返回
                System.out.println(Thread.currentThread() + "hold lock. notify@ " + sm.format(new Date()));
                lock.notifyAll();
                flag = false;

                try {
                    TimeUnit.SECONDS.sleep(5);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            //再次加锁
            synchronized (lock){
                System.out.println(Thread.currentThread() + "hold lock again. notify@ " + sm.format(new Date()));

                try {
                    TimeUnit.SECONDS.sleep(5);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}


