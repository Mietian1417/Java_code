package 泛型;

import java.util.ArrayList;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 陈子豪
 * Date: 2021-06-03
 * Time: 13:36
 */
class MyArrayList<T> {
    private T[] data;
    private int size;

    public MyArrayList() {
        this.data = (T[]) new Object[10];
        this.size = 0;
    }
    public void add(T value){
        this.data[size++]=value;
    }
    public T getPos(int pos){
        return this.data[pos];
    }
}

public class Test {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Hello ");
        arrayList.add("world!");
        System.out.println(arrayList.get(0));
        System.out.println(arrayList);

        ArrayList<Integer> arrayList1 = new ArrayList<>();
        arrayList1.add(1);
        arrayList1.add(2);
        arrayList1.add(3);
        System.out.println(arrayList1);

        MyArrayList<Integer> myArrayList =new MyArrayList<>();
        myArrayList.add(4);
        myArrayList.add(5);
        myArrayList.add(6);
        System.out.println(myArrayList.getPos(0));
        System.out.println(myArrayList.getPos(1));
        System.out.println(myArrayList.getPos(2));

        MyArrayList<String> myArrayList1 =new MyArrayList<>();
        myArrayList1.add("this is ");
        myArrayList1.add("a apple!");
        System.out.println(myArrayList1.getPos(0)+""+myArrayList1.getPos(1));
    }
}
