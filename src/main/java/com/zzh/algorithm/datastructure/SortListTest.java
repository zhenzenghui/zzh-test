package src.main.java.com.zzh.algorithm.datastructure;

/**
 * 有序链表
 *
 * @author zzh
 * @date 2019/3/13
 */
public class SortListTest {

    public static void main(String[] args) {
        SortList sortList = new SortList();

        sortList.insert(20);
        sortList.insert(40);

        sortList.displayList();

        sortList.insert(10);
        sortList.insert(60);
        sortList.insert(30);

        sortList.displayList();

        sortList.remove();
        sortList.remove();

        sortList.displayList();
    }

}


class SortList{

    private Link3 first;

    public SortList(){
        first = null;
    }

    public boolean isEmpty(){
        return (first == null);
    }

    public void insert(long key){
        Link3 newLink = new Link3(key);
        Link3 previous = null;
        Link3 current = first;

        while (current != null && key > current.dData){
            previous = current;
            current = current.next;
        }

        if (previous == null){
            first = newLink;
        }else {
            previous.next = newLink;
        }

        newLink.next = current;
    }

    public Link3 remove(){
        Link3 temp = first;
        first = first.next;
        return temp;
    }

    public void displayList(){
        Link3 current = first;
        while(current != null){
            current.display();
            current = current.next;
        }
        System.out.println();
    }

}

class Link3{

    public long dData;
    public Link3  next;

    public Link3(long d){
        dData = d;
    }

    public void display(){
        System.out.println(dData);
    }
}
