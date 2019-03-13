package src.main.java.com.zzh.algorithm.datastructure;

/**
 * 双向链表
 * @author zzh
 * @date 2019/3/13
 */
public class DoublyLinked {

    public static void main(String[] args) {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();

        doublyLinkedList.insertFirst(22);
        doublyLinkedList.insertFirst(44);
        doublyLinkedList.insertFirst(66);

        doublyLinkedList.insertLast(11);
        doublyLinkedList.insertLast(33);
        doublyLinkedList.insertLast(55);

        doublyLinkedList.displayForward();
        doublyLinkedList.displayBackward();

        doublyLinkedList.deleteFirst();
        doublyLinkedList.deleteLast();
        doublyLinkedList.deleteKey(11);

        doublyLinkedList.displayForward();

        doublyLinkedList.insertAfter(22,77);
        doublyLinkedList.insertAfter(33,88);

        doublyLinkedList.displayForward();
    }

}


class DoublyLinkedList{

    private Link4 first;
    private Link4 last;

    public DoublyLinkedList(){
        first = null;
        last = null;
    }

    public boolean isEmpty(){
        return (first == null);
    }

    public void insertFirst(long dd){

        Link4 newLink = new Link4(dd);

        if (isEmpty()){
            last = newLink;
        }else {
            newLink.next = first;
            first.previous = newLink;
        }
        first = newLink;
    }

    public void insertLast(long dd){

        Link4 newLink = new Link4(dd);

        if (isEmpty()){
            last = newLink;
            first = newLink;
        }else {
            last.next = newLink;
            newLink.previous = last;
            last = newLink;
        }
    }

    public Link4 deleteFirst(){

        if (isEmpty()){
            return null;
        }

        Link4 temp = first;

        if (first.next == null){
            first = null;
            last = null;
        }else {
            first.next.previous = null;
            first = first.next;
        }

        return temp;
    }

    public Link4 deleteLast(){
        if (isEmpty()){
            return null;
        }
        Link4 temp = last;
        if (first.next == null){
            first = null;
            last = null;
        }else {
            last.previous.next = null;
            last = last.previous;
        }
        return temp;
    }

    public boolean insertAfter(long key, long dd){

        Link4 current = first;
        while(current.dData != key){
            current = current.next;
            if (current == null){
                return false;
            }
        }
        Link4 newLink = new Link4(dd);
        if (current == last){
            newLink.next = null;
            last = newLink;
        }else {
            newLink.next = current.next;
            current.next.previous = newLink;
        }
        current.next = newLink;
        newLink.previous = current;

        return true;
    }

    public Link4 deleteKey(long key){
        Link4 current = first;
        while (current.dData != key){
            current = current.next;
            if (current == null){
                return null;
            }
        }
        if (current == first){
            current.next.previous = null;
            first = current.next;
        }else if (current == last){
            current.previous.next = null;
            last = current.previous;
        }else {
            current.previous.next = current.next;
            current.next.previous = current.previous;
        }
        return current;
    }

    public void displayForward(){
        Link4 current = first;
        while (current != null){
            current.displayLink();
            current = current.next;
        }
        System.out.println();
    }

    public void displayBackward(){
        Link4 current = last;
        while (current != null){
            current.displayLink();
            current = current.previous;
        }
        System.out.println();
    }

}


class Link4{

    public long dData;
    public Link4 next;
    public Link4 previous;

    public Link4(long d){
        dData = d;
    }

    public void displayLink(){
        System.out.println(dData);
    }
}
