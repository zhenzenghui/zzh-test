package src.main.java.com.zzh.designpattern.bridge;

/**
 * 圆形
 * @author zzh
 * @date 2019/11/26
 */
public class CircleRuler implements Ruler {
    @Override
    public void regularize() {
        System.out.println("圆形○");
    }
}
