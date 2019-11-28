package src.main.java.com.zzh.designpattern.chainofresponsibility;

/**
 * @author zzh
 * @date 2019/11/28
 */
public class ConcreteHandle2 extends Handler {


    @Override
    public void handleRequest(String request) {
        if ("two".equals(request)){
            System.out.println("具体处理者2负责处理该请求...");
        }else {
            if (getNextHandle() != null){
                getNextHandle().handleRequest(request);
            }else {
                System.out.println("没人处理该请求2");
            }
        }
    }
}
