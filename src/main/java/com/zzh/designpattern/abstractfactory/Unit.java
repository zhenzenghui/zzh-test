package src.main.java.com.zzh.designpattern.abstractfactory;

/**
 * 抽象父类产品，兵种
 * @author zzh
 * @date 2019/11/20
 */
public abstract class Unit {

    protected int attack; //攻击力

    protected int defence; //防御力

    protected int health; //生命值

    protected int x; //横坐标

    protected int y; //纵坐标

    public Unit(int attack, int defence, int health, int x, int y) {
        this.attack = attack;
        this.defence = defence;
        this.health = health;
        this.x = x;
        this.y = y;
    }

    abstract void attack();

    abstract void show();
}
