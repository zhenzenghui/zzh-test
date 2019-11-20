package src.main.java.com.zzh.designpattern.strategy;

/**
 * 计算器
 * @author zzh
 * @date 2019/11/19
 */
public class Calculator {

    //拥有某种算法策略
    private Strategy strategy;

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    //接入算法策略
    public Strategy getStrategy() {
        return strategy;
    }

    //返回具体策略的结果
    public int getResult(int x, int y){
        return strategy.calculate(x, y);
    }
}
