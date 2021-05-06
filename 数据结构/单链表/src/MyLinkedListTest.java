/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 陈子豪
 * Date: 2021-05-05
 * Time: 19:38
 */
public class MyLinkedListTest {
    public static void main(String[] args) {
        Node node=new Node();
        MyLinkedList mylinkedList=new MyLinkedList();
        mylinkedList.addFirst(15);
        mylinkedList.addFirst(16);
        mylinkedList.addFirst(17);
        mylinkedList.addFirst(18);
        mylinkedList.addLast(14);
        mylinkedList.addLast(13);
        mylinkedList.remove(15);
        mylinkedList.addIndex(5,1);
        mylinkedList.print();
    }
}
