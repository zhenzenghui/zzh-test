package src.main.java.com.zzh.designpattern.abstractfactory;

/**
 * @author zzh
 * @date 2019/11/20
 */
public class AlienFactory implements AbstractFactory {

    private int x;

    private int y;

    public AlienFactory(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public Unit createLowClass() {
        Unit unit = new Roach(x,y);
        System.out.println("制造外星蟑螂兵成功。。。");
        return unit;
    }

    @Override
    public Unit createMidClass() {
        Unit unit = new Spitter(x,y);
        System.out.println("制造外星蟑螂兵成功。。。");
        return unit;
    }

    @Override
    public Unit createHighClass() {
        Unit unit = new Mammoth(x,y);
        System.out.println("制造外星蟑螂兵成功。。。");
        return unit;
    }
}
