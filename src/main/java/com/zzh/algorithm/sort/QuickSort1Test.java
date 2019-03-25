package src.main.java.com.zzh.algorithm.sort;

/**
 * 快速排序
 * 时间复杂度 O(NlogN)
 * @author zzh
 * @date 2019/3/25
 */
public class QuickSort1Test {

    public static void main(String[] args) {

        int maxSize = 20;
        ArrayIns arrayIns = new ArrayIns(maxSize);

        for (int i=0; i<maxSize; i++){
            int v = (int)(Math.random() * 99);
            arrayIns.insert(v);
        }
        arrayIns.display();

        arrayIns.quickSort();

        arrayIns.display();

    }

}

class ArrayIns{

    private long[] theArray;
    private int nElems;

    public ArrayIns(int maxSize){
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

    public void quickSort(){
        recQuickSort(0, nElems-1);
    }

    public void recQuickSort(int left, int right){

        if (left >= right){
            return;
        }else {
            //枢纽
            long pivot = theArray[right];

            //排序，返回枢纽的位置
            int partition = partitionIt(left, right, pivot);

            //递归调用
            recQuickSort(left, partition-1);
            recQuickSort(partition+1, right);
        }

    }

    public int partitionIt(int left, int right, long pivot){

        int rightPtr = right-1;
        int leftPtr = left;

        while(true){
            while (theArray[leftPtr] < pivot){
                leftPtr++;
            }
            while (rightPtr > 0 && theArray[rightPtr] > pivot){
                rightPtr--;
            }
            if (leftPtr >= rightPtr){
                break;
            }else {
                swap(leftPtr, rightPtr);
            }
        }
        swap(leftPtr, right);

        return leftPtr;
    }

    private void swap(int i, int j){
        long value = theArray[i];
        theArray[i] = theArray[j];
        theArray[j] = value;
    }

}