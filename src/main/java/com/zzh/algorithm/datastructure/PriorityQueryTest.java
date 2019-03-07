package src.main.java.com.zzh.algorithm.datastructure;

/**
 * @author zzh
 * @date 2019/3/4
 */
public class PriorityQueryTest {

    public static void main(String[] args){

        PriorityQuery priorityQuery = new PriorityQuery(5);
        priorityQuery.insert(20);
        priorityQuery.insert(10);
        priorityQuery.insert(50);
        priorityQuery.insert(40);
        priorityQuery.insert(30);

        priorityQuery.display();

        while (!priorityQuery.isEmpty()){
            long remove = priorityQuery.remove();
            System.out.print(remove + " ");
        }
    }



}


class PriorityQuery {

    private int maxSize;
    private long[] arr;
    private int nElems;

    public PriorityQuery(int s){
        maxSize = s;
        arr = new long[s];
        nElems = 0;
    }

    //插入
    public void insert(long value){

        if (nElems == 0){
            //如果数组为空
            arr[nElems++] = value;
        }else {
            //如果数组不为空
            int j;
            for (j=nElems-1; j>=0; j--){
                if (value > arr[j]){
                    arr[j+1] = arr[j];
                }else {
                    break;
                }
            }
            arr[j+1] = value;
            nElems++;
        }
    }

    //移除
    public long remove(){
        return arr[--nElems];
    }

    //查看
    public long peekMin(){
        return arr[nElems-1];
    }

    //判断是否数组已满
    public boolean isFull(){
        return nElems == maxSize;
    }

    //判断数组是否已空
    public boolean isEmpty(){
        return nElems == 0;
    }

    public void display(){
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }


}