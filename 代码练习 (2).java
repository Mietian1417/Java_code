/*
//有一个整数序列（可能有重复的整数），现删除指定的某一个整数，输出删除指定数字之后的序列，
//第一行输入一个整数(0≤N≤50)。
//第二行输入N个整数，输入用空格分隔的N个整数。
//第三行输入想要进行删除的一个整数。
//1.不删除，打印时跳过要删除的元素
}import java.util.*;
public class test {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int count = reader.nextInt();
        int[] array = new int[count];
        for (int i = 0; i < count; i++) {
            array[i] = reader.nextInt();
        }
        int dele = reader.nextInt();
        int delecount = 0;
        for (int i = 0; i < count; i++) {
            if (dele == array[i]) {
                delecount++;
            }
        }
        for (int i = 0; i < count; i++) {
            if (array[i] != dele) {
                System.out.print(array[i] + " ");
            }
        }
    }
}*/

/*
//2.删除打印
import java.util.*;
public class test{
    public static void main(String[] args){
        Scanner reader=new Scanner(System.in);
        int count=reader.nextInt();
        int[] array=new int[count];
        for(int i=0;i<count;i++){
            array[i]=reader.nextInt();
        }
        int covercount=0;
        int dele=reader.nextInt();
        //覆盖掉要删除的元素
        for(int i=0;i<count;i++){
            if(dele!=array[i]){
                array[covercount++]=array[i];
            }
        }
        for(int i=0;i<covercount;i++){
            System.out.print(array[i]+" ");
        }
    }
}*/

//输入n个整数的序列，要求对这个序列进行去重操作。所谓去重，
// 是指对这个序列中每个重复出现的整数，只保留该数第一次出现的位置，删除其余位置。
//序列中未被删除数字的前后位置没有发生改变。
//输入包含两行，第一行包含一个正整数n（1 ≤ n ≤ 1000），表示第二行序列中数字的个数；
//第二行包含n个整数（范围1~5000），用空格分隔。
/*
import java.util.*;
public class test{
    public static void main(String[] args){
        Scanner reader=new Scanner(System.in);
        int count=reader.nextInt();
        int[] array=new int[count];
        for(int i=0;i<count;i++){
            array[i]=reader.nextInt();
        }
        for(int i=0;i<count;i++){
            for(int j=i+1;j<count;j++){
                if(array[i]==array[j]){
                    array[j]=0;
                }
            }
        }
        for(int i=0;i<count;i++){
            if(array[i]!=0){
                System.out.print(array[i]+" ");
            }
        }
    }
}*/

//输入两个升序排列的序列，将两个序列合并为一个有序序列并输出。
//输入包含三行，
//第一行包含两个正整数n, m（1 ≤ n,m ≤ 100），用空格分隔。
//n表示第二行第一个升序序列中数字的个数，m表示第三行第二个升序序列中数字的个数。
//第二行包含n个整数（范围1~5000），用空格分隔。第三行包含m个整数（范围1~5000），用空格分隔。
import java.util.*;
public class test{
    public static void main(String[] args){
        Scanner reader=new Scanner(System.in);
        int count1=reader.nextInt();
        int count2=reader.nextInt();
        int[] array=new int[count1+count2];
        for(int i=0;i<count1+count2;i++){
            array[i]=reader.nextInt();
        }
        for(int i=0;i<count1+count2-1;i++){
            for(int j=0;j<count1+count2-1-i;j++){
                if(array[j]>array[j+1]){
                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }
        for(int i=0;i<count1+count2;i++){
            System.out.print(array[i]+" ");
        }
    }
}
