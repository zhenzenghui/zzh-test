package src.main.java.com.zzh.designpattern.singleton;

/**
 * 单例模式  该模式的特点是类一加载就创建的一个单例，保证在调用getInstance方法之前单例就已经存在了
 * 饿汉式单例在类创建时就已经创建了一个静态的对象供系统使用，以后不再改变，所以天生是线程安全的
 * 饿汉式
 *
 * @author zzh
 * @date 2019/4/11
 */
public class HungrySingleton {

    private static final HungrySingleton instance = new HungrySingleton();

    private HungrySingleton(){}

    public static HungrySingleton getInstance(){
        return instance;
    }

}
