package src.main.java.com.zzh.designpattern.decorator;

/**
 * 女孩涂口红
 * @author zzh
 * @date 2019/11/26
 */
public class Lipstick extends Decorator {

    public Lipstick(Showable showable) {
        super(showable);
    }

    @Override
    public void show() {
        System.out.print("涂口红(");
        super.show();
        System.out.print(")");
    }
}
