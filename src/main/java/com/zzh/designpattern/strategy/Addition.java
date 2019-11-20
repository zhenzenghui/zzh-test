package src.main.java.com.zzh.designpattern.strategy;

/**
 * 加法计算
 * @author zzh
 * @date 2019/11/19
 */
public class Addition implements Strategy {
    @Override
    public int calculate(int x, int y) {
        return x + y;
    }
}
