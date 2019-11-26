package src.main.java.com.zzh.designpattern.adapter;

/**
 * 对象适配器
 * @author zzh
 * @date 2019/11/26
 */
public class ObjectAdapter implements Target{

    private Adaptee adaptee;

    public ObjectAdapter(Adaptee adaptee){
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        adaptee.specificRequest();
    }
}
