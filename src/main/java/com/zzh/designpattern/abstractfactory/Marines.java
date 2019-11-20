package src.main.java.com.zzh.designpattern.abstractfactory;

/**
 * 人类 海军陆战队
 * @author zzh
 * @date 2019/11/20
 */
public class Marines extends Unit {

    public Marines(int x, int y){
        super(6,5,40,x,y);
    }
    @Override
    void attack() {
        System.out.println("士兵攻击，攻击力 ： " + attack);
    }

    @Override
    void show() {
        System.out.println("士兵出现，坐标为[ " + x + "," + y + " ]");
    }
}
