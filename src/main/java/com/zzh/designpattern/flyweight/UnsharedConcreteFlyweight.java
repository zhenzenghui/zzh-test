package src.main.java.com.zzh.designpattern.flyweight;


/**
 * @author zzh
 * @date 2019/11/26
 */
public class UnsharedConcreteFlyweight {

    private String info;

    public UnsharedConcreteFlyweight(String info){
        this.info = info;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
