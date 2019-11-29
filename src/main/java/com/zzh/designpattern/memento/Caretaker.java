package src.main.java.com.zzh.designpattern.memento;

/**
 * 管理者
 * @author zzh
 * @date 2019/11/29
 */
public class Caretaker {

    private Memento memento;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
