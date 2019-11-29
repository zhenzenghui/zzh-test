package src.main.java.com.zzh.designpattern.visitor;

/**
 * 具体访问者A类
 * @author zzh
 * @date 2019/11/29
 */
public class ConcreteVisitorA implements Visitor {
    @Override
    public void visit(ConcreteElementA concreteElementA) {
        System.out.println("具体访问者A访问-->"+ concreteElementA.operationA());
    }

    @Override
    public void visit(ConcreteElementB concreteElementB) {
        System.out.println("具体访问者A访问-->"+ concreteElementB.operationB());
    }
}
