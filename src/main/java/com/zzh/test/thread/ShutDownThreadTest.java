package src.main.java.com.zzh.test.thread;

/**
 * 安全的终止线程
 * @author zzh
 * @date 2019/7/2
 */
public class ShutDownThreadTest {

    public static void main(String[] args) {

        Runner one = new Runner();
        Thread countThread = new Thread(one, "CountThread-one");
        countThread.start();
        //睡眠一秒，使线程充分执行
        SleepUtils.second(1);
        //中断  利用interrupt方法
        countThread.interrupt();

        Runner two = new Runner();
        countThread = new Thread(two, "CountThread-two");
        countThread.start();
        //睡眠一秒，使线程充分执行
        SleepUtils.second(1);
        //中断，标志位中断
        two.cancel();
    }


    private static class Runner implements Runnable{

        private long i = 0;
        private volatile boolean bool = true;
        @Override
        public void run() {
            while (bool && !Thread.currentThread().isInterrupted()){
                i++;
            }
            System.out.println("Count i = " + i);
        }

        public void cancel(){
            bool = false;
        }

    }


}


