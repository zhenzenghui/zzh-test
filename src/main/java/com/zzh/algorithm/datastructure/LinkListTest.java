package src.main.java.com.zzh.algorithm.datastructure;

/**
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

        while (!linkList.isEmpty()){
            Link link = linkList.deleteFirst();
            System.out.print("delete :");
            link.displayLink();
        }

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
