package src.main.java.com.zzh.test;

import java.util.HashMap;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author zzh
 * @date 2019/4/9
 */
public class HashMapTest {

    public static void main(String[] args) throws InterruptedException {

        /*Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i=0; i<2; i++){
                    test();
                }
            }
        });
        thread.start();*/

        /*HashMap hashMap = new HashMap(2);
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    new Thread(new Runnable() {
                        @Override
                        public void run() {
                            hashMap.put(UUID.randomUUID().toString(), "");
                            System.out.println(Thread.currentThread());
                        }
                    }, "ftf" + i).start();
                }
            }
        }, "ftf");
        t.start();
        try {
            t.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/

        int a = 4;
        int i = (a |= 1);
        int n=2;
        n ^= 1;
        System.out.println(n);
    }

    /*private static void test() {
        HashMap hashMap = new HashMap(2);
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    new Thread(new Runnable() {
                        @Override
                        public void run() {
                            hashMap.put(UUID.randomUUID().toString(), "");
                            System.out.println(Thread.currentThread());
                        }
                    }, "ftf" + i).start();
                }
            }
        }, "ftf");
        t.start();
        try {
            t.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }*/

}

