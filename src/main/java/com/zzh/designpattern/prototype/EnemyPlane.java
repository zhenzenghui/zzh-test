package src.main.java.com.zzh.designpattern.prototype;

/**
 * 敌机类
 * @author zzh
 * @date 2019/11/19
 */
public class EnemyPlane implements Cloneable{

    private int x; //敌机横坐标

    private int y; //敌机纵坐标

    public EnemyPlane(int x){
        System.out.println("EnemyPlane 构造方法被调用。。。");
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    /*public void setY(int y) {
        this.y = y;
    }*/

    //让敌机飞
    /*public void fly(){
        y++;
    }*/

    @Override
    protected EnemyPlane clone() throws CloneNotSupportedException {
        return (EnemyPlane)super.clone();
    }
}
