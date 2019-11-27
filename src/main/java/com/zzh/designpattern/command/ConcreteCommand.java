package src.main.java.com.zzh.designpattern.command;


/**
 * 具体命令
 * @author zzh
 * @date 2019/11/27
 */
public class ConcreteCommand implements Command {

    private Receiver receiver;

    public ConcreteCommand(){
        receiver = new Receiver();
    }

    @Override
    public void execute() {
        receiver.action();
    }
}
