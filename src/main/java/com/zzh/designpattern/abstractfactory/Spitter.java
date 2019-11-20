package src.main.java.com.zzh.designpattern.abstractfactory;

/**
 * 外星 毒液口水兵
 * @author zzh
 * @date 2019/11/20
 */
public class Spitter extends Unit{

    public Spitter(int x, int y){
        super(40,50,80,x,y);
    }

    @Override
    void attack() {
        System.out.println("毒液口水兵攻击，攻击力： " + attack);
    }

    @Override
    void show() {
        System.out.println("毒液口水兵出现，坐标为[ " + x + "," + y + " ]");
    }
}
