package src.main.java.com.zzh.algorithm.sort;


/**
 * @author zzh
 * @date 2019/3/20
 */
public class MergeSortTest {
    public static void main(String[] args){
        MergeSort mergeSort = new MergeSort(10);

        mergeSort.insert(33);
        mergeSort.insert(11);
        mergeSort.insert(88);
        mergeSort.insert(99);
        mergeSort.insert(22);
        mergeSort.insert(44);
        mergeSort.insert(77);
        mergeSort.insert(55);
        mergeSort.insert(66);

        mergeSort.display();

        mergeSort.mergeS();

        mergeSort.display();
    }
}


class MergeSort{

    private long[] theArray;
    private int nElems;

    public MergeSort(int maxSize){
        theArray = new long[maxSize];
        nElems = 0;
    }

    public void insert(long value){
        theArray[nElems] = value;
        nElems++;
    }

    public void display(){
        for (int i=0; i< theArray.length; i++){
            System.out.print(theArray[i] + " ");
        }
        System.out.println();
    }

    public void mergeS(){
        long[] workSpace = new long[nElems];
        resMergeS(workSpace, 0, nElems-1);
    }

    private void resMergeS(long[] workSpace, int lowerBound, int upperBound){
        if (lowerBound == upperBound){
            return;
        }else {
            int mid = (lowerBound + upperBound)/2;
            resMergeS(workSpace, lowerBound, mid);
            resMergeS(workSpace, mid+1, upperBound);
            merge(workSpace, lowerBound, mid+1, upperBound);
        }
    }

    private void merge(long[] workSpace, int lowerPtr, int highPtr, int upperBound){

        int j = 0;
        int lowerBound = lowerPtr;
        int mid = highPtr -1;
        int n = upperBound - lowerBound + 1;

        while(lowerPtr <= mid && highPtr <= upperBound){
            if (theArray[lowerPtr] < theArray[highPtr]){
                workSpace[j++] = theArray[lowerPtr++];
            }else {
                workSpace[j++] = theArray[highPtr++];
            }
        }
        while (lowerPtr <= mid){
            workSpace[j++] = theArray[lowerPtr++];
        }
        while (highPtr <= upperBound){
            workSpace[j++] = theArray[highPtr++];
        }

        for (int i=0; i<n; i++){
            theArray[lowerBound+i] = workSpace[i];
        }
    }

}