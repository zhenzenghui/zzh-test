package src.main.java.com.zzh.designpattern.proxy;

/**
 * 主题代理类
 * @author zzh
 * @date 2019/11/22
 */
public class SubjectProxy implements Subject{

    private Subject subject;

    public SubjectProxy(){
        this.subject = new RealSubject();
        System.out.println("RealSubject 的代理类创建成功");
    }

    @Override
    public void Request() {
        this.preRequest();
        subject.Request();
        this.afterRequest();
    }

    private void preRequest(){
        System.out.println("访问真实主题之前的处理");
    }

    private void afterRequest(){
        System.out.println("访问真实主题之后的处理");
    }

}
