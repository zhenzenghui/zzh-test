package src.main.java.com.zzh.designpattern.visitor;

/**
 * @author zzh
 * @date 2019/11/29
 */
public interface Visitor {

    void visit(ConcreteElementA concreteElement1);

    void visit(ConcreteElementB concreteElement2);

}
