package src.main.java.com.zzh.designpattern.bridge;

/**
 * 三角形
 * @author zzh
 * @date 2019/11/26
 */
public class TriangleRuler implements Ruler {
    @Override
    public void regularize() {
        System.out.println("三角形△");
    }
}
