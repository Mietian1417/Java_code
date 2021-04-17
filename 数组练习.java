//检查数组是否有序

/*import java.util.*;
public class test{
    public static void main(String[] args){
        boolean ascendingOrder=true;
        int[] array={1,2,4,6,5,8};
        //检查数组是否为升序
        for (int i = 0; i <array.length-1 ; i++) {
            if(array[i]>array[i+1])
            {
                ascendingOrder=false;
                break;
            }
        }
       if(ascendingOrder==true){
           System.out.println("该数组为升序数组！");
       }
       else{
           System.out.println("该数组不为为升序数组！");
        }
    }
}*/


//逆序数组
/*
public class test{
    public static void main(String[] args) {
        int[] array={1,5,6,9,8,7,6};
        for (int i = 0; i < array.length/2 ; i++) {
            int temp=array[i];
            array[i]=array[array.length-1-i];
            array[array.length-1-i]=temp;
        }
        for (int x:array) {
            System.out.print(x+" ");
        }
    }
}
*/

/*
//把数组奇数排前 偶数排后
public class test{
    public static void main(String[] args) {
        int[] array={1,2,3,4,5,6,7,8,9};
        int i=0;
        int j=array.length-1;
        while(i < j) {
            while(i<j && array[i]%2!=0){
                i++;
            }
            while(i<j && array[j]%2==0){
                j--;
            }
            int temp=array[i];
            array[i]=array[j];
            array[j]=temp;
        }
        System.out.println(Arrays.toString(array));
    }
}*/
/*
import java.util.*;
public class test{
    public static void binarySearch(int[] array,int x){
        int left=0;
        int right=array.length-1;
        int mid=(left+right)/2;
        while(left<=right){
            if(x<array[mid]){
                right=mid-1;
                mid=(left+right)/2;
            }
            else if(x>array[mid]){
                left=mid+1;
                mid=(left+right)/2;
            }
            else{
                System.out.println("找到了，下标是："+mid);
                break;
            }
        }
        if(left>right){
            System.out.println("找不到！");
        }
    }
    public static void main(String[] args){
        int[] array={1,2,3,4,5};
        binarySearch(array,6);

    }
}
*/

/*
public class test{
    public static int[] copyOf(int[] array){
        int[] copy=new int[array.length];
        for (int i = 0; (i < array.length) ; i++) {
            copy[i]=array[i];
        }
        return copy;
    }
    public static void main(String[] args) {
        int[] array={1,2,4,5,6,7};
        int[] ret=copyOf(array);
        System.out.println(Arrays.toString(ret));
    }
}*/

//toString的模拟实现
/*
public class test{
    public static String myToSrting(int[] array){
        String ret="[";
        for (int i = 0; i < array.length ; i++) {
            ret+=array[i];
            if(i!=array.length - 1){
                ret+=",";
            }
        }
        ret+="]";
        return ret;
    }
    public static void main(String[] args) {
        int[] array={1,2,3,4,5};
        System.out.println(myToSrting(array));

    }
}*/

//二分查找
import java.util.*;
public class test{
    public static void binarySearch(int[] array,int x){
        int left=0;
        int right=array.length-1;
        int mid=(left+right)/2;
        while(left<=right){
            if(x<array[mid]){
                right=mid-1;
                mid=(left+right)/2;
            }
            else if(x>array[mid]){
                left=mid+1;
                mid=(left+right)/2;
            }
            else{
                System.out.println("找到了，下标是："+mid);
                break;
            }
        }
        if(left>right){
            System.out.println("找不到！");
        }
    }
    public static void main(String[] args){
        int[] array={1,2,3,4,5};
        binarySearch(array,6);

    }
}
