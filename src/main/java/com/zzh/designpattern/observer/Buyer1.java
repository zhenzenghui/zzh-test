package src.main.java.com.zzh.designpattern.observer;

/**
 * @author zzh
 * @date 2019/11/28
 */
public class Buyer1 extends Buyer {

    public Buyer1(String buyerName, Shop shop){
        super(buyerName,shop);
    }

    @Override
    public void inform() {
        String product = shop.getProduct();
        if (product.contains("苹果")){
            System.out.println(buyerName);
            System.out.println(" 购买 " + product);
        }
    }
}
