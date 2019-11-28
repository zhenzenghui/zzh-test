package src.main.java.com.zzh.designpattern.observer;

/**
 * 抽象买家
 * @author zzh
 * @date 2019/11/28
 */
public abstract class Buyer {

    protected String buyerName;

    protected Shop shop;

    public Buyer(String buyerName, Shop shop){
        this.buyerName = buyerName;
        this.shop = shop;
    }

    public abstract void inform();

}
