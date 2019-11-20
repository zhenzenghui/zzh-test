package src.main.java.com.zzh.designpattern.abstractfactory;

/**
 * 外星 猛犸巨兽
 * @author zzh
 * @date 2019/11/20
 */
public class Mammoth extends Unit {

    public Mammoth(int x, int y){
        super(300,500,600,x,y);
    }

    @Override
    void attack() {
        System.out.println("猛犸巨兽攻击，攻击力： " + attack);
    }

    @Override
    void show() {
        System.out.println("猛犸巨兽出现，坐标为[ " + x + "," + y  + " ]");
    }
}
