package src.main.java.com.zzh.designpattern.prototype;

/**
 * 造飞机的工厂
 * @author zzh
 * @date 2019/11/19
 */
public class EnemyPlaneFactory {

    private static EnemyPlane protoType = new EnemyPlane(100);

    //获取敌机克隆实例
    public static EnemyPlane getInstance(int x) {
        //复制原型机
        EnemyPlane clone = null;
        try {
            clone = protoType.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        clone.setX(x);
        return clone;
    }
}
