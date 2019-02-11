package src.main.java.com.zzh.concurrent;

import java.util.concurrent.CyclicBarrier;

/**
 * CyclicBarrier提供的一个高级的构造函数CyclicBarrier(int parties, Runnable barrierAction),在线程达到屏障时，优先执行barrierAction
 * @author zzh
 * @date 2019/2/7
 */
public class CyclicBarrierTest2 {

    static CyclicBarrier cyclicBarrier = new CyclicBarrier(2,new A());

    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    cyclicBarrier.await();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                System.out.println("--->" + 1);
            }
        }).start();

        try {
            cyclicBarrier.await();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("--->" + 2);
    }

}


class   A implements Runnable{

    @Override
    public void run() {
        System.out.println("--->" + 3);
    }
}