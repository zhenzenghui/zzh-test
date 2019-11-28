package src.main.java.com.zzh.designpattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zzh
 * @date 2019/11/28
 */
public class Shop {

    private String product;

    private List<Buyer> buyers;

    public Shop(){
        this.product = "无商品";
        this.buyers = new ArrayList<>();
    }

    //为了主动通知买家，买家需要在店里注册信息
    public void register(Buyer buyer){
        buyers.add(buyer);
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
        this.notifyBuyer();
    }

    private void notifyBuyer(){
        buyers.forEach(buyer -> buyer.inform());
    }
}
