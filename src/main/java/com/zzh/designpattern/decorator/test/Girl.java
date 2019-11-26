package src.main.java.com.zzh.designpattern.decorator.test;

/**
 * @author zzh
 * @date 2019/11/26
 */
public class Girl extends Change {


    public Girl(Morrigan morrigan) {
        super(morrigan);
    }

    @Override
    public void display() {
        morrigan.display();
        System.out.println("莫莉卡 穿上女神装");
    }
}
