package src.main.java.com.zzh.designpattern.observer;

/**
 * 具体买家2
 * @author zzh
 * @date 2019/11/28
 */
public class Buyer2 extends Buyer {

    public Buyer2(String buyerName, Shop shop){
        super(buyerName,shop);
    }

    @Override
    public void inform() {
        String product = shop.getProduct();
        if (product != null){
            System.out.println(buyerName);
            System.out.println(" 购买 " + product);
        }
    }
}
