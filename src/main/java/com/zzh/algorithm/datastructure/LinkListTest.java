package src.main.java.com.zzh.algorithm.datastructure;

/**
 * 单链表
 *
 * @author zzh
 * @date 2019/3/6
 */
public class LinkListTest {

    public static void main(String[] args) {
        LinkList linkList = new LinkList();
        linkList.insertFirst(22, 2.99);
        linkList.insertFirst(44, 4.99);
        linkList.insertFirst(66, 6.99);
        linkList.insertFirst(88, 8.99);

        linkList.displayList();

        /*while (!linkList.isEmpty()){
            Link link = linkList.deleteFirst();
            System.out.print("delete :");
            link.displayLink();
        }*/
        Link link = linkList.find(44);
        link.displayLink();
        Link delete = linkList.delete(44);
        delete.displayLink();

        linkList.displayList();
    }
}


class LinkList{

    private Link first; //LinkList中都是Link对象

    public LinkList(){
        first = null;
    }

    //判断是否为空
    public boolean isEmpty(){
        return (first == null);
    }

    //插入
    public void insertFirst(int iData, double dData){
        Link newLink = new Link(iData, dData);
        newLink.next = first;
        first = newLink;
    }

    //移除
    public Link deleteFirst(){
        Link temp = first;
        first = first.next;
        return temp;
    }

    //根据值去查找链表中的元素
    public Link find(int key){
        Link current = first;
        while (current.iData != key){
            if (current.next == null){
                return null;
            }
            current = current.next;
        }
        return current;
    }

    //根据值去删除链表中的元素
    public Link delete(int key){
        Link current = first;
        Link previous = first;

        while (current.iData != key){
            if (current.next == null){
                return null;
            }
            previous = current;
            current = current.next;
        }
        if (current == first){
            first = current.next;
        }else {
            previous.next = current.next;
        }
        return current;
    }

    public void displayList(){
        System.out.println("List (first- - ->last):");
        Link current = first;
        while (current != null){
            current.displayLink();
            current = current.next;
        }
        System.out.println();
    }

}


class Link{

    public int iData;
    public double dData;
    public Link next;  //指向下一个Link对象

    public Link(int i, double d){
        iData = i;
        dData = d;
    }

    public void displayLink(){
        System.out.println("{" +iData + ", " + dData + "}");
    }

}
