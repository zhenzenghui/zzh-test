package src.main.java.com.zzh.algorithm.sort;

/**
 * 选择排序
 * 时间复杂度 O(n²)
 *
 * @author zzh
 * @date 2019/2/19
 */
public class SelectSortTest {

    public static void main(String[] args) {

        int maxSize = 10;
        SelectSort selectSort = new SelectSort(maxSize);
        selectSort.insert(1);
        selectSort.insert(3);
        selectSort.insert(5);
        selectSort.insert(7);
        selectSort.insert(9);
        selectSort.insert(8);
        selectSort.insert(6);
        selectSort.insert(4);
        selectSort.insert(2);
        selectSort.insert(0);

        selectSort.display();

        selectSort.sort();

        selectSort.display();


    }

}

class SelectSort{

    private int[] arr;
    private int nElems;

    public SelectSort(int max){
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

    //排序方法
    public void sort(){
        for (int i=0; i<arr.length; i++){
            int min = i;
            for (int j=i+1; j<arr.length; j++){
                if (arr[min] > arr[j]){
                    min = j;
                }
            }
            swap(arr,i,min);
        }
    }

    private void swap(int[] arr, int m, int n){
        int temp = arr[m];
        arr[m] = arr[n];
        arr[n] = temp;
    }

}
