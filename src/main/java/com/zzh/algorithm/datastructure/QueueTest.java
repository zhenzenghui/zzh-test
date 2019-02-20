package src.main.java.com.zzh.algorithm.datastructure;

/**
 * 队列：先进先出
 * 数组模拟队列
 *
 * @author zzh
 * @date 2019/2/20
 */
public class QueueTest {

    public static void main(String[] args) {

        QueueX queueX = new QueueX(5);
        queueX.insert(11);
        queueX.insert(22);
        queueX.insert(33);
        queueX.insert(44);

        queueX.remove();
        queueX.remove();
        queueX.remove();

        queueX.insert(55);
        queueX.insert(66);
        queueX.insert(77);
        queueX.insert(88);

        while (!queueX.isEmpty()){
            long value = queueX.remove();
            System.out.print(value + " ");
        }

    }

}

class QueueX{

    private int maxSize; //最大长度
    private long[] arr;  //定义数组
    private int front;  //队列头指针
    private int rear;  //队列尾指针
    private int nElems;  //队列长度

    public QueueX(int i){
        maxSize = i;
        arr = new long[i];
        front = 0;
        rear = -1;
        nElems = 0;
    }

    //插入数据
    public void insert(long value){
        if (rear == maxSize-1){
            rear = -1;
        }
        arr[++rear] = value;
        nElems++;
    }

    //移除数据
    public long remove(){
        long temp = arr[front++];
        if (front == maxSize){
            front = 0;
        }
        nElems--;
        return temp;
    }

    //查看数据
    public long peekfront(){
        return arr[front];
    }

    //是否为空
    public boolean isEmpty(){
        return (nElems == 0);
    }

    //是否已满
    public boolean isFull(){
        return (nElems == maxSize);
    }

    //数据长度
    public int size(){
        return nElems;
    }




}
