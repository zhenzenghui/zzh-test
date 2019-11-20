package src.main.java.com.zzh.designpattern.abstractfactory;

/**
 * 人类工厂实现
 * @author zzh
 * @date 2019/11/20
 */
public class HumanFactory implements AbstractFactory {

    private int x;

    private int y;

    public HumanFactory(int x,int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public Unit createLowClass() {
        Unit marines = new Marines(x, y);
        System.out.println("制造海军陆战队员成功。。。");
        return marines;
    }

    @Override
    public Unit createMidClass() {
        Unit tank = new Tank(x, y);
        System.out.println("制造坦克成功。。。");
        return tank;
    }

    @Override
    public Unit createHighClass() {
        Unit battleship = new Battleship(x, y);
        System.out.println("制造战列舰成功。。。");
        return battleship;
    }
}
