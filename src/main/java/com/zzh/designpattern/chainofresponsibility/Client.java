package src.main.java.com.zzh.designpattern.chainofresponsibility;

/**
 * @author zzh
 * @date 2019/11/28
 */
public class Client {

    public static void main(String[] args) {
        Handler handler1 = new ConcreteHandle1();
        handler1.setNextHandle(new ConcreteHandle2());

        handler1.handleRequest("two1");
    }

}
