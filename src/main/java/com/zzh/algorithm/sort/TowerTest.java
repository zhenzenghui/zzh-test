package src.main.java.com.zzh.algorithm.sort;

/**
 * 汉诺塔问题   递归
 * @author zzh
 * @date 2019/3/19
 */
public class TowerTest {

    private static int nDisks = 32;

    private static int num = 0;

    public static void main(String[] args) {

        doTowers(nDisks, 'A', 'B', 'C');

        System.out.println("总次数 ：" + num);
    }

    private static void doTowers(int topN, char from, char inter, char to){

        num++;
        if (topN == 1){
            System.out.println("Disk 1 from " + from + " to " + to);
        }else {
            doTowers(topN-1, from, to, inter); //from --> inter
            System.out.println("Disk " + topN + " from " + from + " to " + to);
            doTowers(topN-1, inter, from, to); //inter --> to
        }
    }

}
