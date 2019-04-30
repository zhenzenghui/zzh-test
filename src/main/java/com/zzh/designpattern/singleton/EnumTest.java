package src.main.java.com.zzh.designpattern.singleton;


/**
 * 枚举类   枚举本身就是单例的，默认构造方法是private的
 *
 * @author zzh
 * @date 2019/4/29
 */
public class EnumTest {

    /*RED,GREEN,BLUE;

    static int value;
    public static int getValue(){
        return value;
    }

    String type;
    public String getType(){
        return type;
    }*/
    public static void main(String[] args) {

        Test red = Test.RED;
        System.out.println(red);

        int value = red.getValue();
        System.out.println(value);

        red.ttt();

        Test.BLUE.ttt();

    }
}

 enum Test{

     RED(0){
         @Override
         public void ttt(){
             System.out.println("red  - >  0");
         }
     },
     GREEN(1),
     BLUE(2);

     private int value;

     Test(int value){
         this.value = value;
     }

     public int getValue(){
         return value;
     }

     public void ttt(){
         System.out.println("red");
     }

 }
