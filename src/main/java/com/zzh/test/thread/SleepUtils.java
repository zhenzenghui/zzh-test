package src.main.java.com.zzh.test.thread;

import java.util.concurrent.TimeUnit;

/**
 * @author zzh
 * @date 2019/7/2
 */
public class SleepUtils {

    public static final void second(long seconds){

        try {
            TimeUnit.SECONDS.sleep(seconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}
