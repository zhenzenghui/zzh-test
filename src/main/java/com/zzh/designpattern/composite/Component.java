package src.main.java.com.zzh.designpattern.composite;

/**
 * 抽象构件
 * @author zzh
 * @date 2019/11/27
 */
public interface Component {

    void add(Component component);

    void remove(Component component);

    Component getChild(int i);

    void operation();

}
