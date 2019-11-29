package src.main.java.com.zzh.designpattern.visitor;

/**
 * @author zzh
 * @date 2019/11/29
 */
public class ConcreteElementA implements Element {

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public String operationA(){
        return  "具体元素A的操作";
    }
}
