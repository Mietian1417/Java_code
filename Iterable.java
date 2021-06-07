package Iterable.Collection.List接口.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 陈子豪
 * Date: 2021-06-07
 * Time: 18:04
 */
public class MethodTest {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);
        linkedList.add(6);
        linkedList.add(7);
        linkedList.add(8);

        //删除第二个元素
        Iterator<Integer> integerIterator = linkedList.iterator();
        integerIterator.next();
        integerIterator.next();
        integerIterator.remove();

        //由于next的移动，我们需要用一个新的迭代器来打印
        Iterator<Integer> integerIterator1 =linkedList.iterator();
        while(integerIterator1.hasNext()){
            System.out.print(integerIterator1.next()+" ");
        }
    }
}
