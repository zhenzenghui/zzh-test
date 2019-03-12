package src.main.java.com.zzh.algorithm.datastructure;

/**
 * 链表实现队列
 *
 * @author zzh
 * @date 2019/3/12
 */
public class LinkQueueTest {
    public static void main(String[] args) {
        LinkQueue linkQueue = new LinkQueue();
        linkQueue.insert(20);
        linkQueue.insert(40);

        linkQueue.display();

        linkQueue.insert(60);
        linkQueue.insert(80);

        linkQueue.display();

        linkQueue.remove();
        linkQueue.remove();

        linkQueue.display();
    }

}

class Link2{

    public long dData;
    public Link2 next;

    public Link2(long d){
        dData = d;
    }

    public void displayLink(){
        System.out.println(dData);
    }
}

class FirstLastList{

    private Link2 first;
    private Link2 last;

    public FirstLastList(){
        first = null;
        last = null;
    }

    public boolean isEmpty(){
        return (first == null);
    }

    public void insertLast(long d){
        Link2 newLink = new Link2(d);
        if (isEmpty()){
            first = newLink;
        }else {
            last.next = newLink;
        }
        last = newLink;
    }

    public long deleteFirst(){
        if (isEmpty()){
            return 0;
        }
        long temp = first.dData;
        if (first.next == null){
            last = null;
        }
        first = first.next;
        return temp;
    }

    public void displayList(){
        Link2 current = first;
        while (current != null){
            current.displayLink();
            current = current.next;
        }
    }

}

class LinkQueue{

    private FirstLastList theLsit;

    public LinkQueue(){
        theLsit = new FirstLastList();
    }

    public boolean isEmpty(){
        return theLsit.isEmpty();
    }

    public void insert(long j){
        theLsit.insertLast(j);
    }

    public long remove(){
        return theLsit.deleteFirst();
    }

    public void display(){
        theLsit.displayList();
        System.out.println();
    }
}
