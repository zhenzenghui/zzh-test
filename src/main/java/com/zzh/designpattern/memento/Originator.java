package src.main.java.com.zzh.designpattern.memento;

/**
 * 发起人
 * @author zzh
 * @date 2019/11/29
 */
public class Originator {

    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Memento createMemento(){
        return new Memento(state);
    }

    public void restoreMemento(Memento memento){
        this.setState(memento.getState());
    }

}
