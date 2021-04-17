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
