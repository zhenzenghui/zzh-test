package src.main.java.com.zzh.algorithm.sort;


/**
 * 希尔排序
 * @author zzh
 * @date 2019/3/22
 */
public class ShellSortTest {

    public static void main(String[] args) {

        int maxSize = 10000;
        ArraySh arraySh = new ArraySh(maxSize);
        for (int i=0; i<maxSize; i++){
            int v = (int)(Math.random() * 99999);
            arraySh.insert(v);
        }
        arraySh.display();

        arraySh.shellSort();

        arraySh.display();

        //System.out.println(arraySh.total());

        System.out.println(arraySh.time());
    }

}

class ArraySh{

    private long[] theArray;
    private int nElems;

    //private int total;

    private long startTime = 0l;
    private long endTime = 0l;

    public ArraySh(int maxSize){
        theArray = new long[maxSize];
        nElems = 0;
    }

    public void insert(long value){
        theArray[nElems] = value;
        nElems++;
    }

    public void display(){
        for (int i=0; i<nElems; i++){
            System.out.print(theArray[i] + " ");
        }
        System.out.println();
    }

    public void shellSort(){

        startTime = System.currentTimeMillis();

        int outer;
        int inner;

        int h = 1;
        while (h < nElems/3 ){
            h = 3*h + 1;
        }

        while (h>0){
            for ( outer=h; outer<nElems; outer++){
                long temp = theArray[outer];
                inner = outer;
                while (inner>h-1 && temp<theArray[inner-h]){
                    theArray[inner] = theArray[inner-h];
                    inner = inner-h;
                    //total++;
                }
                theArray[inner] = temp;
            }

            h = (h-1)/3;
        }

        endTime = System.currentTimeMillis();
    }

    /*public int total(){
        return total;
    }*/

    public long time(){
        return endTime - startTime;
    }
}