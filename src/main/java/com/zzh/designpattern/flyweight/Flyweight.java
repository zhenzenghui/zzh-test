package src.main.java.com.zzh.designpattern.flyweight;

/**
 * 抽象享元角色
 * @author zzh
 * @date 2019/11/26
 */
public interface Flyweight {
    void operation(UnsharedConcreteFlyweight state);
}
