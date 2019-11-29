package src.main.java.com.zzh.designpattern.mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zzh
 * @date 2019/11/28
 */
public class ConcreteMediator extends Mediator {

    private List<Colleague> colleagueList = new ArrayList<>();

    @Override
    public void register(Colleague colleague) {
        if (!colleagueList.contains(colleague)){
            colleagueList.add(colleague);
            colleague.setMediator(this);
        }
    }

    @Override
    public void relay(Colleague fromWhom) {
        colleagueList.stream().filter(colleague1 -> !colleague1.equals(fromWhom))
                .forEach(Colleague::receive);
    }
}
