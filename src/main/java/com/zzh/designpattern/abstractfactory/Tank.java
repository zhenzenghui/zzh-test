package src.main.java.com.zzh.designpattern.abstractfactory;

/**
 * 人类 坦克
 * @author zzh
 * @date 2019/11/20
 */
public class Tank extends Unit {

    public Tank(int x, int y){
        super(40,60,100,x,y);
    }

    @Override
    void attack() {
        System.out.println("坦克攻击，攻击力： " + attack);
    }

    @Override
    void show() {
        System.out.println("坦克出现，坐标为[ " + x + "," + y + "," + " ]");
    }
}
