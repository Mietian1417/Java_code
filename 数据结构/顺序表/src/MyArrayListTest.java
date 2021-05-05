/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 陈子豪
 * Date: 2021-05-05
 * Time: 17:14
 */
public class MyArrayListTest {
    public static void main(String[] args) {
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add(0, 1);
        myArrayList.add(1, 2);
        myArrayList.add(2, 3);
        myArrayList.add(3, 4);
        myArrayList.add(4, 5);
        //myArrayList.add(5,7);
        System.out.println(myArrayList.contains(5));
        System.out.println(myArrayList.contains(6));
        System.out.println(myArrayList.search(5));
        //  System.out.println(myArrayList.search(6));
        //  System.out.println(myArrayList.setPos(4));
        myArrayList.stePos(2, 6);
        for (int i = 0; i < myArrayList.size; i++) {
            System.out.print(myArrayList.elem[i] + " ");
        }
        myArrayList.clear();
        System.out.println();
        for (int i = 0; i < myArrayList.size; i++) {
            System.out.print(myArrayList.elem[i] + " ");
        }
    }
}


