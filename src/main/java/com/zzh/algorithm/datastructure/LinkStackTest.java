package src.main.java.com.zzh.algorithm.datastructure;

/**
 * @author zzh
 * @date 2019/3/8
 */
public class LinkStackTest {

    public static void main(String[] args) {
        LinkStack linkStack = new LinkStack();

        linkStack.push(10);
        linkStack.push(20);
        linkStack.push(30);
        linkStack.display();
        System.out.println();

        linkStack.push(40);
        linkStack.push(50);

        linkStack.display();
        System.out.println();

        long pop1 = linkStack.pop();
        System.out.println(pop1);
        System.out.println();

        long pop2 = linkStack.pop();
        System.out.println(pop2);
        System.out.println();

        linkStack.display();
    }

}


class Link1{

    public long dData;
    public Link1 next;

    public Link1(long d){
        dData = d;
    }

    public void displayLink(){
        System.out.println(dData);
    }

}

class LinkList1{

    private Link1 first;

    public LinkList1(){
        first = null;
    }

    public boolean isEmpty(){
        return (first == null);
    }

    public void insertFirst(long data){
        Link1 newLink = new Link1(data);
        newLink.next = first;
        first = newLink;
    }

    public long deleteFirst(){
        Link1 temp = first;
        first = first.next;
        return temp.dData;
    }

    public void displayList(){
        Link1 current = first;
        while (current != null){
            System.out.println(current.dData);
            current = current.next;
        }
    }
}

class LinkStack{

    private LinkList1 theLink;

    public LinkStack(){
        theLink = new LinkList1();
    }

    public void push(long j){
        theLink.insertFirst(j);
    }

    public long pop(){
        return theLink.deleteFirst();
    }

    public boolean isEmpty(){
        return theLink.isEmpty();
    }

    public void display(){
        theLink.displayList();
    }

}