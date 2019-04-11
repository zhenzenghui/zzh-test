package src.main.java.com.zzh.test;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author zzh
 * @date 2019/4/10
 */
public class AtomicTest1 {

    static AtomicInteger atomicInteger = new AtomicInteger(2);

    public static void main(String[] args) {
        System.out.println(atomicInteger.get());
        System.out.println(atomicInteger.getAndIncrement());
        System.out.println(atomicInteger.get());
    }

}
