package src.main.java.com.zzh.designpattern.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zzh
 * @date 2019/11/27
 */
public class Composite implements Component {

    private List<Component> children = new ArrayList<>();

    @Override
    public void add(Component component) {
        children.add(component);
    }

    @Override
    public void remove(Component component) {
        children.remove(component);
    }

    @Override
    public Component getChild(int i) {
        return children.get(i);
    }

    @Override
    public void operation() {
        children.forEach(e -> e.operation());
    }
}
