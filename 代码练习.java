//有一个有序数字序列，从小到大排序，将一个新输入的数插入到序列中，保证插入新数后，序列仍然是升序。
/*import java.util.*;
public class test{
    public static void main(String[] args){
        Scanner reader=new Scanner(System.in);
        int n=reader.nextInt();
        int[] array=new int[n+1];
        for(int i=0;i<n;i++){
            array[i]=reader.nextInt();
        }
        int pos=n;
        int insert =reader.nextInt();
        for(int i=0;i<n;i++){
            if(array[i]>insert){
                pos=i;
                break;
            }
        }
        for(int j=n-1;j>=pos;j--){
            array[j+1]=array[j];
        }
        array[pos]=insert;
        for(int i=0;i<n+1;i++){
            System.out.print(array[i]+" ");
        }
    }
}*/

//输入一个整数序列，判断是否是有序序列，有序，指序列中的整数从小到大排序或者从大到小排序。
/*
import java.util.*;
public class test{
    public static void main(String[] args){
        Scanner reader=new Scanner(System.in);
        int n=reader.nextInt();
        int[] array=new int[n];
        boolean change1=true;
        boolean change2=true;
        for(int i=0;i<n;i++){
            array[i]=reader.nextInt();
        }
        for(int i=0;i<n-1;i++){
            if(array[i]<array[i+1]){
                change1=false;
            }
            if(array[i]>array[i+1]){
                change2=false;
            }
        }
        if(change1||change2){
            System.out.println("sorted");
        }
        else{
            System.out.println("unsorted");
        }
    }
}*/

//输入n个成绩，换行输出n个成绩中最高分数和最低分数的差。
import java.util.*;
public class test{
    public static void main(String[] args){
        Scanner reader=new Scanner(System.in);
        int n=reader.nextInt();
        int[] array=new int[n];
        for(int i=0;i<n;i++){
            array[i]=reader.nextInt();
        }
        for(int i=1;i<n;i++){
            for(int j=0;j<=n-i-1;j++){
                if(array[j]<array[j+1]){
                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }
        System.out.println(array[0]-array[n-1]);
    }
}
