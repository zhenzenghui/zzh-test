package src.main.java.com.zzh.designpattern.singleton;

/**
 * 懒加载单例模式  测试
 * @author zzh
 * @date 2019/4/11
 */
public class LazySingletonTest {

    public static void main(String[] args) {

        President president1 = President.getInstance();
        president1.getName();
        President president2 = President.getInstance();
        president2.getName();

        if (president1 == president2){
            System.out.println("他们是同一个人");
        }else {
            System.out.println("他们不是同一个人");
        }
    }

}

class President{

    private static volatile President president = null;

    private President(){
        System.out.println("产出一个总统！");
    }

    public static President getInstance(){
        if (null == president){
            synchronized (President.class){
                if (null == president){
                    president = new President();
                }
            }
        }else {
            System.out.println("已经有一个总统，不能产生新总统！！");
        }
        return president;
    }

    public void getName(){
        System.out.println("我是美国总统：特朗普");
    }
}
