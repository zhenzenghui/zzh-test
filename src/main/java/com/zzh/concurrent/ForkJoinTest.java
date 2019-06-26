package src.main.java.com.zzh.concurrent;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveTask;

/**
 * 计算1+2+3+4，每个子任务最多执行两个数相加，设置分隔的阈值是2，4个数相加，fork/join框架会把这个任务fork成两个子任务，最后在join两个子任务的结果
 * @author zzh
 * @date 2019/6/25
 */
public class ForkJoinTest{

    public static void main(String[] args) {
        ForkJoinPool forkJoinPool = new ForkJoinPool();
        //生成一个计算任务，负责计算1+2+3+4
        CountTask countTask = new CountTask(1, 4);
        //执行任务
        ForkJoinTask<Integer> result = forkJoinPool.submit(countTask);

        try {
            Integer integer = result.get();
            System.out.println(integer);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }

}

class CountTask extends RecursiveTask<Integer>{

    //阈值
    private static final int THRESHOLD = 2;

    private int start;
    private int end;

    public CountTask(int start, int end){
        this.start = start;
        this.end = end;
    }

    @Override
    protected Integer compute() {

        int sum = 0;

        //如果任务足够小就直接计算任务
        boolean canCompute = (end - start) <= THRESHOLD;
        if (canCompute){
            for (int i = start; i <= end; i++){
                sum += i;
            }
        } else {
            //如果任务大于阈值，就拆分成两个子任务计算
            int middle = (start + end) / 2;
            CountTask leftTask = new CountTask(start, middle);
            CountTask rightTask = new CountTask(middle+1, end);
            //执行子任务
            leftTask.fork();
            rightTask.fork();
            //等待子任务执行完，饼得到结果
            int leftResult = leftTask.join();
            int rightResult = rightTask.join();
            //合并子任务
            sum = leftResult + rightResult;
        }
        return sum;
    }

}
