package src.main.java.com.zzh.designpattern.decorator.test;

/**
 * @author zzh
 * @date 2019/11/26
 */
public class Client {

    public static void main(String[] args) {

        Original original = new Original();
        original.display();

        Succubus succubus = new Succubus(new Original());
        succubus.display();

        Girl girl = new Girl(new Original());
        girl.display();
    }
}
