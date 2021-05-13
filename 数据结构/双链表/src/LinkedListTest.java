/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 陈子豪
 * Date: 2021-05-13
 * Time: 18:10
 */
public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList linkedList=new LinkedList();
        linkedList.addFirst(16);
        linkedList.addFirst(4);
        linkedList.addFirst(3);
        linkedList.addFirst(2);
        linkedList.addFirst(1);
        linkedList.addFirst(2);
        linkedList.addFirst(3);
        linkedList.addFirst(4);
        linkedList.addFirst(5);
        linkedList.print();
        linkedList.remove(16);
        linkedList.print();
    }
}
