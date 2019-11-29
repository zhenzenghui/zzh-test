package src.main.java.com.zzh.designpattern.mediator;

/**
 * @author zzh
 * @date 2019/11/28
 */
public class ConCreteColleague1 extends Colleague {
    @Override
    void receive() {
        System.out.println("具体同事类1收到请求。。。");
    }

    @Override
    void send() {
        System.out.println("具体同事类1发出请求。。。");
        //请中介转发
        mediator.relay(this);
    }
}
