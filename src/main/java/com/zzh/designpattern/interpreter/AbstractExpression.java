package src.main.java.com.zzh.designpattern.interpreter;

/**
 * 抽象表达式
 * @author zzh
 * @date 2019/11/29
 */
public interface AbstractExpression {

    //解释方法
    public Object interpret(String info);

}
