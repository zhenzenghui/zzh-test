package src.main.java.com.zzh.designpattern.visitor;

/**
 * 抽象元素类
 * @author zzh
 * @date 2019/11/29
 */
public interface Element {

    void accept(Visitor visitor);

}
