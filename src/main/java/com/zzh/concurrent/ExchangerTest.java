package src.main.java.com.zzh.concurrent;

import java.util.concurrent.Exchanger;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Exchanger
 * @author zzh
 * @date 2019/2/12
 */
public class ExchangerTest {

    private static final Exchanger<String> exchanger = new Exchanger<>();

    private static ExecutorService threadPool = Executors.newFixedThreadPool(2);

    public static void main(String[] args) {

        threadPool.execute(new Runnable() {
            @Override
            public void run() {
                try {
                    String A = "银行流水A";
                    String exchange = exchanger.exchange(A);
                    System.out.println("A:"+exchange);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        threadPool.execute(new Runnable() {
            @Override
            public void run() {
                try {
                    String B = "银行流水B";
                    String exchange = exchanger.exchange(B);
                    System.out.println("A与B的数据是否一样：" + exchange.equals(B));
                    System.out.println("B:"+exchange);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        /*threadPool.execute(new Runnable() {
            @Override
            public void run() {
                try {
                    String C = "银行流水C";
                    String exchange = exchanger.exchange(C);
                    System.out.println("C:"+exchange);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });*/

        threadPool.shutdown();

    }

}
