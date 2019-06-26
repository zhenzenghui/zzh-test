package src.main.java.com.zzh.concurrent;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * 基于CAS线程安全的计数器safeCount和一个非线程安全的计数器count
 * @author zzh
 * @date 2019/6/26
 */
public class CasTest {

    public static void main(String[] args) {

        final Counter cas = new Counter();
        List<Thread> ts = new ArrayList<>(500);

        long start = System.currentTimeMillis();

        //创建100个线程，每个线程加10000次
        for (int j=0; j<100; j++){
            Thread t = new Thread(() -> {
                for (int i=0; i<10000; i++){
                    cas.count();
                    cas.safeCount();
                }
            });
            ts.add(t);
        }

        //开始每个线程
        for (Thread thread : ts){
            thread.start();
        }

        //等待所有线程执行完成
        for (Thread thread : ts){
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println(cas.i);
        System.out.println(cas.atomicInteger.get());
        System.out.println(System.currentTimeMillis() - start);

    }

}


class Counter{

    public AtomicInteger atomicInteger = new AtomicInteger(0);

    public int i = 0;

    //使用cas操作实现线程安全的计数器
    public void safeCount(){

        for (;;){
            int i = atomicInteger.get();
            boolean b = atomicInteger.compareAndSet(i, ++i);
            if (b){
                break;
            }
        }
        //atomicInteger.getAndIncrement();
        //atomicInteger.incrementAndGet();

    }

    //非线程安全的计数器
    public void count(){

        i++;

    }

}
