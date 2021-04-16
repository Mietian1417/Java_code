import java.util.*;
public class test{
    public static void main(String[] args){
        Scanner reader=new Scanner(System.in);
        int n=reader.nextInt();n
        int sum=0;
        int[] array=new int[];
        for(int i=0;i<n;i++){
            array[i]=reader.nextInt();
        }
        for(int i=0;i<n;i++){
            sum+=array[i];
        }
        System.out.println(sum);
    }
}