package src.main.java.com.zzh.designpattern.decorator.test;

/**
 * @author zzh
 * @date 2019/11/26
 */
public class Change implements Morrigan {

    protected Morrigan morrigan;

    public Change(Morrigan morrigan){
        this.morrigan = morrigan;
    }

    @Override
    public void display() {
        morrigan.display();
    }
}
