package src.main.java.com.zzh.algorithm.datastructure;

/**
 * 栈结构：先进后出
 * 数组模拟实现
 *
 * @author zzh
 * @date 2019/2/20
 */
public class StackTest {

    public static void main(String[] args){

        StackX stackX = new StackX(10);

        stackX.push(11);
        stackX.push(22);
        stackX.push(33);
        stackX.push(44);
        stackX.push(55);
        stackX.push(66);
        stackX.push(77);
        stackX.push(88);
        stackX.push(99);

        while(!stackX.isEmpty()){
            int peek = stackX.peek();
            System.out.println(peek);
            int pop = stackX.pop();
            System.out.print(pop);
            System.out.println();

        }
    }

}

class StackX{

    private int maxSize; //数组大小
    private int[] arr;  //定义数组
    private int top;  //栈顶指针的位置

    //构造方法 初始化数组大小，指针的位置
    public StackX(int s){
        maxSize = s;
        arr = new int[s];
        top = -1;
    }

    //入栈
    public void push(int value){
        arr[++top] = value;
    }

    //出栈
    public int pop(){
        return arr[top--];
    }

    //查看
    public int peek(){
        return arr[top];
    }

    //是否为空
    public boolean isEmpty(){
        return (top == -1);
    }

    //是否已满
    public boolean isFull(){
        return (top == maxSize-1);
    }

}
