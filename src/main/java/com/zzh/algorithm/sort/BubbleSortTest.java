package src.main.java.com.zzh.algorithm.sort;

/**
 * 冒泡排序（由小到大） 时间复杂度 O(n²)
 * @author zzh
 * @date 2019/2/18
 */
public class BubbleSortTest {

    public static void main(String[] args) {
        int[] arr = {1,3,5,7,9,8,6,4,2,0};
        BubbleSort.sort(arr);
        display(arr);

    }

    public static void display(int[] arr){
        for (int i=0; i<arr.length; i++){
            System.out.println("arr[" + "i" + "] = " + arr[i]);
        }
    }

}

class BubbleSort{

    public static void sort(int[] arr){

        if (arr == null){
            return;
        }
        //外层循环控制循环的次数，循环 arr.length-1 次
        for (int i=0; i<arr.length-1; i++){
            //内层循环控制比较的次数
            for (int j=0; j<arr.length-1-i; j++){
                //if (arr[j] > arr[j+1]){  由大到小
                if (arr[j] > arr[j+1]){
                    swap(arr, j, j+1);
                }
            }
        }
    }

    private static void swap(int[] arr, int m, int n){
        int temp = arr[m];
        arr[m] = arr[n];
        arr[n] = temp;
    }

}
