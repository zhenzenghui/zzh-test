package src.main.java.com.zzh.designpattern.iterator;


/**
 * 抽象聚合
 * @author zzh
 * @date 2019/11/29
 */
public interface Aggregate {

    void add(Object object);

    void remove(Object object);

    Iterator getIterator();

}
