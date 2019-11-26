package src.main.java.com.zzh.designpattern.bridge;

/**
 * 白色的画笔
 * @author zzh
 * @date 2019/11/26
 */
public class WhitePen extends Pen {


    public WhitePen(Ruler ruler){
        super(ruler);
    }

    @Override
    public void draw() {
        System.out.print("白色  ");
        ruler.regularize();
    }
}
