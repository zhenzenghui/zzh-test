package src.main.java.com.zzh.designpattern.chainofresponsibility;

/**
 * 抽象处理者
 * @author zzh
 * @date 2019/11/28
 */
public abstract class Handler {

    private Handler nextHandle;

    public void setNextHandle(Handler nextHandle) {
        this.nextHandle = nextHandle;
    }

    public Handler getNextHandle() {
        return nextHandle;
    }

    public abstract void handleRequest(String request);
}
