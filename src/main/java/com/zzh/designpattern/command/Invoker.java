package src.main.java.com.zzh.designpattern.command;

/**
 * 调用者
 * @author zzh
 * @date 2019/11/27
 */
public class Invoker {

    private Command command;

    public Invoker(Command command){
        this.command = command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void call(){
        System.out.println("调用者执行命令command...");
        command.execute();
    }
}
