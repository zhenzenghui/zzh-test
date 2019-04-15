package src.main.java.com.zzh.concurrent.effective;

import java.util.concurrent.TimeUnit;

/**
 * 同步可以保证 数据同步和共享数据的可见性
 * @author zzh
 * @date 2019/4/15
 */
public class StopThreadTest {

    //volatile 保证变量的可见性 ， 但是对于 ++ 操作不适用
    private static volatile boolean stopRequest = false;

    public static void main (String[] args) throws Exception{
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                int i = 0;
                while (!stopRequest){
                    i++;
                    System.out.println(i);
                }
            }
        });
        thread.start();
        TimeUnit.SECONDS.sleep(1);
        stopRequest = true;
    }

}


