package src.main.java.com.zzh.designpattern.visitor;

/**
 * 具体访问者
 * @author zzh
 * @date 2019/11/29
 */
public class ConcreteVisitorB implements Visitor {
    @Override
    public void visit(ConcreteElementA concreteElementA) {
        System.out.println("具体访问者B访问-->"+ concreteElementA.operationA());
    }

    @Override
    public void visit(ConcreteElementB concreteElementB) {
        System.out.println("具体访问者B访问-->"+ concreteElementB.operationB());
    }
}
