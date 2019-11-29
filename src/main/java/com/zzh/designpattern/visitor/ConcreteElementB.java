package src.main.java.com.zzh.designpattern.visitor;

/**
 * @author zzh
 * @date 2019/11/29
 */
public class ConcreteElementB implements Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public String operationB(){
        return "具体元素B 的操作";
    }
}
