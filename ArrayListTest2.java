package Collection.List接口.ArrayList;

import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 陈子豪
 * Date: 2021-06-05
 * Time: 15:21
 */

// List 当中的存放是整形的数据，要求使用 Collection.sort 对 List 进行排序
public class ArrayListTest2 {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(15);
        list.add(8);
        list.add(7);
        list.add(14);
        Iterator<Integer> integerIterator = list.iterator();
        while (integerIterator.hasNext()) {
            System.out.print(integerIterator.next() + " ");
        }
        System.out.println();

        //list.sort(Integer::compareTo);
        Collections.sort(list);

        Iterator<Integer> integerIterator1 = list.iterator();
        while (integerIterator1.hasNext()) {
            System.out.print(integerIterator1.next() + " ");
        }
    }
}
