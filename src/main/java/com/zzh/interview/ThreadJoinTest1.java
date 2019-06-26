package src.main.java.com.zzh.interview;

/**
 * 现在有线程 T1、T2 和 T3。你如何确保 T2 线程在 T1 之后执行，并且 T3 线程在 T2 之后执行？
 * 这个线程面试题通常在第一轮面试或电话面试时被问到，这道多线程问题为了测试面试者是否熟悉 join 方法的概念。答案也非常简单——可以用 Thread 类的 join 方法实现这一效果。
 * @author zzh
 * @date 2019/5/27
 */
public class ThreadJoinTest1 {

    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new Thread(new JoinTest1());
        t1.setName("thread1");
        Thread t2 = new Thread(new JoinTest1());
        t2.setName("thread2");
        Thread t3 = new Thread(new JoinTest1());
        t3.setName("thread3");

        t1.start();
        t1.join();

        t2.start();
        t2.join();

        t3.start();
        t3.join();

    }
}


class JoinTest1 implements Runnable{

    @Override
    public void run() {
        for (int i=0; i<10; i++){
            System.out.println(Thread.currentThread().getName() + "-----" + i);
        }
    }
}
