package src.main.java.com.zzh.designpattern.abstractfactory;

/**
 * 抽象工厂
 * @author zzh
 * @date 2019/11/20
 */
public interface AbstractFactory {

    Unit createLowClass(); //创建低级兵种

    Unit createMidClass(); //创建中级兵种

    Unit createHighClass(); //创建高级兵种

}
