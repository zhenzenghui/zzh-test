package src.main.java.com.zzh.designpattern.memento;

/**
 * 备忘录
 * @author zzh
 * @date 2019/11/29
 */
public class Memento {

    private String state;

    public Memento(String state){
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
