package src.main.java.com.zzh.designpattern.mediator;

/**
 * 抽象同事类
 * @author zzh
 * @date 2019/11/28
 */
public abstract class Colleague {

    protected Mediator mediator;

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    abstract void receive();

    abstract void send();
}
