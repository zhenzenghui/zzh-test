package src.main.java.com.zzh.concurrent;

import java.util.Map;
import java.util.concurrent.*;

/**
 * CyclicBarrier的应用
 * 银行流水处理服务类
 *
 * @author zzh
 * @date 2019/2/11
 */
public class BankWaterService implements Runnable{

    //创建四个屏障，处理完之后执行当前类的run方法
    private CyclicBarrier cyclicBarrier = new CyclicBarrier(4, this);

    //假设只有4个sheet，所有只启动4个线程
    private Executor executor = Executors.newFixedThreadPool(4);

    //保存每个sheet计算出来的银行流水结果
    private Map<String, Integer> concurrentHashMap = new ConcurrentHashMap<>();

    private void count(){
        for (int i=0; i<4; i++){
            executor.execute(new Runnable() {
                @Override
                public void run() {
                    //计算当前sheet的流水数据，代码省略
                    concurrentHashMap.put(Thread.currentThread().getName(),1);
                    try {
                        //银行流水计算完成，插入一个屏障
                        cyclicBarrier.await();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } catch (BrokenBarrierException e) {
                        e.printStackTrace();
                    }
                }
            });
        }
    }


    @Override
    public void run() {
        int result = 0;
        for (Map.Entry<String,Integer> entry : concurrentHashMap.entrySet()){
            result += entry.getValue();
        }
        //将结果输出
        concurrentHashMap.put("result",result);
        System.out.println(result);
    }

    public static void main(String[] args) {
        BankWaterService bankWaterService = new BankWaterService();
        //new Thread(bankWaterService).start();
        bankWaterService.count();
    }

}
