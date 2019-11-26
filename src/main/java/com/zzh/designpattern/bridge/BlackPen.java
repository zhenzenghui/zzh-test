package src.main.java.com.zzh.designpattern.bridge;

/**
 * 黑色的画笔
 * @author zzh
 * @date 2019/11/26
 */
public class BlackPen extends Pen {

    public BlackPen(Ruler ruler){
        super(ruler);
    }

    @Override
    public void draw() {
        System.out.print("黑色  ");
        ruler.regularize();
    }
}
