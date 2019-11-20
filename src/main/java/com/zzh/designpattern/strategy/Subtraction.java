package src.main.java.com.zzh.designpattern.strategy;

/**
 * 减法
 * @author zzh
 * @date 2019/11/19
 */
public class Subtraction implements Strategy {
    @Override
    public int calculate(int x, int y) {
        return x - y;
    }
}
