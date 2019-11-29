package src.main.java.com.zzh.designpattern.interpreter;

/**
 * 非终结符表达式
 * @author zzh
 * @date 2019/11/29
 */
public class NonterminalExpression implements AbstractExpression {
    @Override
    public Object interpret(String info) {
        System.out.println("非终结符表达式的处理。。。");
        return null;
    }
}
