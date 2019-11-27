package src.main.java.com.zzh.designpattern.templatemethod;

/**
 * @author zzh
 * @date 2019/11/27
 */
public class Client {

    public static void main(String[] args) {
        HookAbstractClass hookAbstractClass = new ConcreteClass();
        hookAbstractClass.templateMethod();
    }


}
