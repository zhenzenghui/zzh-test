package src.main.java.com.zzh.designpattern.decorator;

/**
 * 装饰器类
 * @author zzh
 * @date 2019/11/26
 */
public abstract class Decorator implements Showable {

    protected Showable showable;

    public Decorator(Showable showable){
        this.showable = showable;
    }

    @Override
    public void show() {
        //直接调用展示方法
        showable.show();
    }
}
