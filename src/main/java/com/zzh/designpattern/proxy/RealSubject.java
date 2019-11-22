package src.main.java.com.zzh.designpattern.proxy;

/**
 * 抽象主题的实现类
 * @author zzh
 * @date 2019/11/22
 */
public class RealSubject implements Subject {
    @Override
    public void Request() {
        System.out.println("访问真实主题方法");
    }
}
