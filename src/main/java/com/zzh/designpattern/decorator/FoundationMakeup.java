package src.main.java.com.zzh.designpattern.decorator;

/**
 * 女孩打粉底
 * @author zzh
 * @date 2019/11/26
 */
public class FoundationMakeup extends Decorator{

    public FoundationMakeup(Showable showable) {
        super(showable);
    }

    @Override
    public void show() {
        System.out.print("打粉底(");
        super.show();
        System.out.print(")");
    }
}
