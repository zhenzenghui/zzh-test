package src.main.java.com.zzh.designpattern.visitor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 对象结构角色
 * @author zzh
 * @date 2019/11/29
 */
public class ObjectStructure {

    private List<Element> list = new ArrayList<>();

    public void accept(Visitor visitor){
        Iterator<Element> iterator = list.iterator();
        while (iterator.hasNext()){
            iterator.next().accept(visitor);
        }
    }

    public void add(Element element){
        list.add(element);
    }

    public void remove(Element element){
        list.remove(element);
    }


}
