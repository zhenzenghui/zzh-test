package src.main.java.com.zzh.designpattern.bridge;

/**
 * 方形尺子
 * @author zzh
 * @date 2019/11/26
 */
public class SquareRuler implements Ruler {
    @Override
    public void regularize() {
        System.out.println("正方形□");
    }
}
