package Collection集合;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 陈子豪
 * Date: 2021-05-31
 * Time: 19:35
 */
public class MethodTest {
    public static void main(String[] args) {
        //boolean add(E e)
        //将元素 e 放到集合中
        Collection<String> collection=new ArrayList<>();
        collection.add("你好");
        collection.add("世界");
        System.out.println(collection);
        //void clear()
        //删除结合中的所有元素
        collection.clear();
        System.out.println(collection);

        //boolean isEmpty()
        //判断集合是否没有任何元素，俗称空集合
        Collection<Integer> collection1=new ArrayList<>();
        collection1.add(123);
        collection1.add(456);
        collection1.add(789);
        collection1.add(123);

        System.out.println(collection.isEmpty());
        System.out.println(collection1.isEmpty());

        //boolean remove(object e)
        //如果元素 e 出现在集合中，删除其中一个
        collection1.remove(1);
        System.out.println(collection1);
        collection1.remove(123);
        System.out.println(collection1);

        //int size()
        //返回集合中的元素个数
        System.out.println(collection.size());
        System.out.println(collection1.size());

        //Object[] toArray()
        //返回一个装有所有集合中元素的数组
        Collection<String> collection2=new LinkedList<>();
        collection2.add("123");
        collection2.add("+");
        collection2.add("789");
        System.out.println(collection2);
        System.out.println(Arrays.toString(collection.toArray()));
        System.out.println(Arrays.toString(collection1.toArray()));
        System.out.println(Arrays.toString(collection2.toArray()));

        Object[] array=collection2.toArray();
        System.out.println(Arrays.toString(array));

    }
}

