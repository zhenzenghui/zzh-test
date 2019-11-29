package src.main.java.com.zzh.designpattern.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体聚合
 * @author zzh
 * @date 2019/11/29
 */
public class ConcreteAggregate implements Aggregate {

    private List<Object> list = new ArrayList<>();

    @Override
    public void add(Object object) {
        list.add(object);
    }

    @Override
    public void remove(Object object) {
        list.remove(object);
    }

    @Override
    public Iterator getIterator() {
        return new ConcreteIterator(list);
    }
}
