package src.main.java.com.zzh.designpattern.adapter;

/**
 * 类适配器
 * @author zzh
 * @date 2019/11/26
 */
public class ClassAdapter extends Adaptee implements Target {
    @Override
    public void request() {
        specificRequest();
    }
}
