package src.main.java.com.zzh.designpattern.factorymethod;

/**
 * @author zzh
 * @date 2019/11/20
 */
public class ConcreteFactory2 implements AbstractFactory {
    @Override
    public Product newProduct() {
        System.out.println("工厂2生成----->产品2");
        return new ConcreteProduct2();
    }
}
