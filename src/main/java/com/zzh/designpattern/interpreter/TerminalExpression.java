package src.main.java.com.zzh.designpattern.interpreter;

/**
 * 终结符表达式
 * @author zzh
 * @date 2019/11/29
 */
public class TerminalExpression implements AbstractExpression {
    @Override
    public Object interpret(String info) {
        System.out.println("终结符表达式处理");
        return "终结符表达式";
    }
}
