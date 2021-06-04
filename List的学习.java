package Collection.List接口.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 陈子豪
 * Date: 2021-06-04
 * Time: 19:12
 */
public class Test {
    public static void main(String[] args) {
        List<Integer> list =new ArrayList<>(); //实现接口
        //1. boolean add(E e)
        //尾插 e
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);

        //2. void add(int index, E element)
        //将 e 插入到 index 位置（从 0 开始）
        list.add(0,0);
        System.out.println(list);

        //3. boolean addAll(Collection <? extends E> c)
        // 尾插 c 中的元素
        List<Integer> list1 =new ArrayList<>();
        list1.add(4);
        list1.add(5);
        list1.add(6);
        list.addAll(list1);
        System.out.println(list1);
        System.out.println(list1);

        //4. E remove(int index)
        //删除 index 位置元素
        list.remove(1);
        System.out.println(list);

        //5. boolean remove(Object o)
        // 删除遇到的第一个 o
        List<String> list2 =new ArrayList<>();
        list2.add("This");
        list2.add("is");
        list2.add("a");
        list2.add("apple!");
        list2.remove("apple!");
        System.out.println(list2);
        System.out.println(list.remove(list.get(2)));


        //6. E get (int index)
        // 获取下标 index 位置的元素
        Integer integer = list.get(1);
        System.out.println(integer);

        int a =list.get(3);  //拆箱
        System.out.println(a);

        //7. E set(int index, E element)
        // 将下标 index 位置元素设置为 element
        System.out.println(list.get(4));
        list.set(4,1);
        System.out.println(list.get(4));

        //8. void clear()
        // 清空
        System.out.println(list);
        list.clear();
        System.out.println(list);

        //9. boolean contains(Object o)
        //判断 o 是否在线性表中
        System.out.println(list2.contains("This"));
        System.out.println(list2.contains("this"));
        System.out.println(list.contains(1));

        //10. int indexOf(Object o)
        //返回第一个 o 所在下标
        List<Integer> list3 =new ArrayList<>(); //实现接口
        list3.add(1);
        list3.add(2);
        list3.add(3);
        list3.add(1);
        list3.add(2);
        list3.add(3);
        System.out.println(list3.indexOf(2));
        System.out.println(list3.indexOf(7));

        //11. int lastIndexOf(Object o)
        //返回最后一个 o 的下标
        System.out.println(list3.lastIndexOf(2));
        System.out.println(list3.lastIndexOf(7));

        //12.List<E> subList(int forIndex,int toIndex)
        //截取部分list
        //截取的原理是用新对象直接引用数组对应下标的地址，十分危险。
        List<Integer> list4 = list3.subList(2,4);
        System.out.println(list4);
        list4.set(1,55);
        System.out.println("截取的数组："+list4);
        System.out.println("原数组："+list3);

        // Iterable 迭代器打印
        List<Integer> list5 =new ArrayList<>(); //实现接口
        list5.add(1);
        list5.add(2);
        list5.add(3);
        list5.add(4);
        list5.add(5);
        list5.add(6);
        Iterator<Integer> integers = list5.iterator();
        while(integers.hasNext()){
            System.out.print(integers.next()+" ");
        }
    }
}
