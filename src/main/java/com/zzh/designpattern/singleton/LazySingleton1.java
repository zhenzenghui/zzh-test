package src.main.java.com.zzh.designpattern.singleton;

/**
 * 单例模式
 * 懒加载模式   该模式的特点是类加载的时候没有生成单例，只有第一次调用getInstance方法的时候才去创建这个实例。
 * 双重检查锁定
 *
 * @author zzh
 * @date 2019/4/11
 */
public class LazySingleton1 {

    //私有化的静态实例，此处赋值为null， 目的是实现延迟加载
    private static LazySingleton1 singleton = null;

    //私有的构造方法，防止在外部被实例化
    private LazySingleton1(){}

    //静态方法，创建实例
    public static LazySingleton1 getInstance(){
        if (null == singleton){
            synchronized(LazySingleton1.class){
                if (null == singleton){
                    singleton = new LazySingleton1();
                }
            }
        }
        return singleton;
    }

}

/**
 * 单例模式
 * 懒加载模式
 * 匿名内部类方式
 */
class LazySingleton2{

    //静态内部类
    private static class LazyHolder{
        private static final LazySingleton2 INSTANCE = new LazySingleton2();
    }

    private LazySingleton2(){}

    public static LazySingleton2 getInstance(){
        return LazyHolder.INSTANCE;
    }

}
