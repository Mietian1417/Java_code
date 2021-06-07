package Iterable;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 陈子豪
 * Date: 2021-06-07
 * Time: 18:24
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

        Iterator<Integer> integerIterator = linkedList.iterator();

        /* 迭代器的删除是删除 next方法上一次遍历的数据，
         如果 next方法没有被调用就使用 remove方法会报错 */
        integerIterator.next();
        integerIterator.next();
        integerIterator.remove();

        //由于 next的移动，该迭代器无法打印 next前面的数据
        while (integerIterator.hasNext()) {
            System.out.print(integerIterator.next() + " ");
        }

        System.out.println();
        
        //两个迭代器互不干扰，但是由迭代器删除的元素影响到原始数据，进而影响到后面的迭代器
        Iterator<Integer> integerIterator1 =linkedList.iterator();
        while (integerIterator1.hasNext()) {
            System.out.print(integerIterator1.next() + " ");
        }
    }
}
