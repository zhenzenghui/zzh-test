package src.main.java.com.zzh.designpattern.facade;

/**
 * @author zzh
 * @date 2019/11/26
 */
public class Facade {

    private SubSystem01 subSystem01 = new SubSystem01();

    private SubSystem02 subSystem02 = new SubSystem02();

    private SubSystem03 subSystem03 = new SubSystem03();

    public void method0(){
        subSystem01.method1();
        subSystem02.method2();
        subSystem03.method3();
    }

}
