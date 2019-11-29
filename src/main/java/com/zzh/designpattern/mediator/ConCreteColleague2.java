package src.main.java.com.zzh.designpattern.mediator;

/**
 * 具体同事类2
 * @author zzh
 * @date 2019/11/28
 */
public class ConCreteColleague2 extends  Colleague {
    @Override
    void receive() {
        System.out.println("具体同事类2收到请求。。。");
    }

    @Override
    void send() {
        System.out.println("具体同事类2发出请求。。。");
        //中介转发
        mediator.relay(this);
    }
}
