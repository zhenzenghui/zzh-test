package src.main.java.com.zzh.designpattern.abstractfactory;

/**
 * 人类 战列舰
 * @author zzh
 * @date 2019/11/20
 */
public class Battleship extends Unit {

    public Battleship(int x,int y){
        super(500,800,1000,x,y);
    }

    @Override
    void attack() {
        System.out.println("战列舰攻击，攻击力： " + attack);
    }

    @Override
    void show() {
        System.out.println("战列舰出现，坐标为[ " + x + "," + y + " ]");
    }
}
