package src.main.java.com.zzh.designpattern.abstractfactory;

/**
 * 外星 蟑螂兵
 * @author zzh
 * @date 2019/11/20
 */
public class Roach extends Unit {

    public Roach(int x,int y){
        super(5,2,35,x,y);
    }

    @Override
    void attack() {
        System.out.println("蟑螂兵攻击，攻击力： " + attack);
    }

    @Override
    void show() {
        System.out.println("蟑螂兵出现，坐标为[ " + x + "," + y + " ]");
    }
}
