package src.main.java.com.zzh.designpattern.factorymethod;

/**
 * @author zzh
 * @date 2019/11/20
 */
public class ConcreteFactory1 implements AbstractFactory {
    @Override
    public Product newProduct() {
        System.out.println("工厂1生成---->产品1");
        return new ConcreteProduct1();
    }
}
