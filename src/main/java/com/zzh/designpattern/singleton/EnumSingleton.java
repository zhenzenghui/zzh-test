package src.main.java.com.zzh.designpattern.singleton;


/**
 * 枚举类单例  枚举默认构造方法是private的
 *
 * enum Type{
 *     A,B,C,D;
 * }
 * 创建enum时，编译器会自动为我们生成一个继承自java.lang.Enum的类，我们上面的enum可以简单看作：
 * class Type extends Enum{
 *     public static final Type A;
 *     public static final Type B;
 *     ...
 * }
 *
 *
 * @author zzh
 * @date 2019/4/30
 */
public class EnumSingleton {

    private EnumSingleton(){

    }

    public static EnumSingleton getInstance(){

        return Singleton.INSTANCE.getInstance();
    }

    private enum Singleton{
        INSTANCE;

        private EnumSingleton enumSingleton;

        Singleton(){
            enumSingleton = new EnumSingleton();
        }

        public EnumSingleton getInstance(){
            return enumSingleton;
        }
    }

    public static void main(String[] args) {
        EnumSingleton enumSingleton1 = EnumSingleton.getInstance();
        EnumSingleton enumSingleton2 = EnumSingleton.getInstance();
        System.out.println(enumSingleton1 == enumSingleton2);
        System.out.println(enumSingleton1);
        System.out.println(enumSingleton2);

    }

}
