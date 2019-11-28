package src.main.java.com.zzh.designpattern.observer;

/**
 * @author zzh
 * @date 2019/11/28
 */
public class Client {

    public static void main(String[] args) {
        Shop shop = new Shop();
        shop.register(new Buyer1("果粉张三",shop));
        shop.register(new Buyer1("剁手党李四",shop));

        shop.setProduct("xxxxxx");
        shop.setProduct("苹果xxxxxx");
    }
}
