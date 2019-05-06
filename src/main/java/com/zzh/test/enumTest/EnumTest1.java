package src.main.java.com.zzh.test.enumTest;

/**
 * effective Java 用实例域代替序数
 * 每个枚举都有一个ordinal方法，他返回每个枚举常量在类型中的数字位置，从0开始，一般不要这样用，位置变动的时候不好控制
 * @author zzh
 * @date 2019/5/6
 */
public class  EnumTest1 {

    public static void main(String[] args) {
        /*int index = Enum1.BLUE.numberOf();
        System.out.println(index);*/
        Enum1[] values = Enum1.values();
        for (int i=0; i<values.length; i++){
            int i1 = values[i].numberOf();
            System.out.println(i1);
        }
        System.out.println();

        Enum2[] values2 = Enum2.values();
        for (int i=0; i<values2.length; i++){
            int i1 = values2[i].numberOf();
            System.out.println(i1);
        }


    }
}

enum Enum1{

    RED,
    BLUE,
    GREEN,
    YELLOW;

    public int numberOf(){
        return ordinal();
    }
}

enum Enum2{

    RED(1),
    BLUE(2),
    GREEN(3),
    YELLOW(4);

    private int num;

    Enum2(int num){
        this.num = num;
    }

    public int numberOf(){
        return num;
    }
}
