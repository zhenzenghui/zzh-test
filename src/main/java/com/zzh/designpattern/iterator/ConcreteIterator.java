package src.main.java.com.zzh.designpattern.iterator;

import java.util.List;

/**
 * @author zzh
 * @date 2019/11/29
 */
public class ConcreteIterator implements Iterator {

    private List<Object> list = null;
    private int index = -1;

    public ConcreteIterator(List<Object> list){
        this.list = list;
    }

    @Override
    public Object first() {
        index = 0;
        return list.get(index);
    }

    @Override
    public Object next() {
        Object obj = null;
        if (this.hasNext()){
            obj = list.get(++index);
        }
        return obj;
    }

    @Override
    public boolean hasNext() {
        if (index<list.size()-1){
            return true;
        }else {
            return false;
        }
    }
}
