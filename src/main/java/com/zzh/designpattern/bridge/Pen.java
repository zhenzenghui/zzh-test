package src.main.java.com.zzh.designpattern.bridge;

/**
 * 画笔
 * @author zzh
 * @date 2019/11/26
 */
public abstract class Pen {

    //尺子引用
    protected Ruler ruler;

    public Pen(Ruler ruler){
        this.ruler = ruler;
    }

    //抽象方法
    public abstract void draw();

}
