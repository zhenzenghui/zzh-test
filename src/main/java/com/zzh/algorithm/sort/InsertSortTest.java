package src.main.java.com.zzh.algorithm.sort;

/**
 * 插入排序(由小到大)
 *时间复杂度O(n²)
 *
 * @author zzh
 * @date 2019/2/19
 */
public class InsertSortTest {

    public static void main(String[] args){
        int maxSize = 10;
        InsertSort insertSort = new InsertSort(maxSize);
        insertSort.insert(1);
        insertSort.insert(3);
        insertSort.insert(5);
        insertSort.insert(7);
        insertSort.insert(9);
        insertSort.insert(8);
        insertSort.insert(6);
        insertSort.insert(4);
        insertSort.insert(2);
        insertSort.insert(0);

        insertSort.display();

        insertSort.sort();

        insertSort.display();
    }
}

class InsertSort{

    private int[] arr;
    private int nElems;

    public InsertSort(int max){
        arr = new int[max];
        nElems = 0;
    }

    public void insert(int value){
        arr[nElems] = value;
        nElems++;
    }

    public void display(){
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public void sort(){
        for (int i=1; i<arr.length; i++){
            int temp = arr[i];
            int j = i;
            while(j>0 && arr[j-1]>temp){
                arr[j] = arr[j-1];
                j--;
            }
            arr[j] = temp;
        }
    }

}
