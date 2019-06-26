package src.main.java.com.zzh.test;

import java.util.Collections;
import java.util.List;

/**
 * @author zzh
 * @date 2019/2/2
 */
public class Test1 {

    static Integer c ;
    public static void main(String[] args) {

        List objects = Collections.emptyList();
        List emptyList = Collections.EMPTY_LIST;
        System.out.println(objects.toString());
        System.out.println(emptyList.toString());
        //ystem.out.println("hello world");

//        Integer a = 1;
//        Integer b =1;
        Integer a = new Integer(1);
        Integer b = new Integer(1);

        System.out.println(a == b);
        //System.out.println(c == 1);//异常

        W w = new W();
        w.tt2();
    }

}

class W{

    public static void tt1(){
        System.out.println(123);
    }
    public void tt2(){
        System.out.println(1234);
    }

}
