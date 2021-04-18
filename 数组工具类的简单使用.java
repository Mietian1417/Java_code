//常用Arrays类的简单使用
import java.util.*;
public class test{
    public static void main(String[] args) {
        int[] array={1,2,3,4,5,6};
//        二分查找
//        System.out.println(Arrays.binarySearch(array, 3));
//        System.out.println(Arrays.binarySearch(array, 2, 4, 4));

//        判断两个数组是否相等
//        int[] array2={1,2,3,4,5,6};
//        int[] array3={1,2,3,4,5};
//        System.out.println(Arrays.equals(array, array2));
//        System.out.println(Arrays.equals(array, array3));

//        数组填充
        System.out.println(Arrays.toString(array));
//        Arrays.fill(array,3);
        Arrays.fill(array,1,4,4);
        System.out.println(Arrays.toString(array));
    }
}