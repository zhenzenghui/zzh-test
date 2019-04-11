package src.main.java.com.zzh.designpattern.singleton;

import javax.swing.*;
import java.awt.*;

/**
 * 饿汉式单例模式 测试
 * @author zzh
 * @date 2019/4/11
 */
public class HungrySingletonTest {

    public static void main(String[] args) {

        JFrame jf = new JFrame("饿汉单例模式测试");
        jf.setLayout(new GridLayout(1,2));
        Container contentPane = jf.getContentPane();

        Bajie bajie1 = Bajie.getInstance();
        contentPane.add(bajie1);

        Bajie bajie2 = Bajie.getInstance();
        contentPane.add(bajie2);

        if (bajie1 == bajie2){
            System.out.println("他们是同一个人");
        }else {
            System.out.println("他们不是同一个人");
        }

        jf.pack();
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}

class Bajie extends JPanel{

    private static final Bajie bajie = new Bajie();

    private Bajie(){
        //JLabel ll = new JLabel(new ImageIcon("src/resource/img/Bajie.jpg"));
        JLabel ll = new JLabel(new ImageIcon("/zzh-resource/Bajie.jpg"));

        this.add(ll);
    }

    public static Bajie getInstance(){
        return bajie;
    }
}
