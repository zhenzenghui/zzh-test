package src.main.java.com.zzh.designpattern.mediator;

/**
 * 抽象中介者
 * @author zzh
 * @date 2019/11/28
 */
public abstract class Mediator {

    //在中介这里注册
    public abstract void register(Colleague colleague);

    //转发
    public abstract  void relay(Colleague colleague);

}
