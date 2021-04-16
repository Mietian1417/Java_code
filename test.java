import java.util.*;
public class test{
    public static void main(String[] args){
        Scanner reader=new Scanner(System.in);
        int[] array=new int[10];
        for(int i=0;i<10;i++){
            array[i]=reader.nextInt();
        }
        for(int i=9;i>=0;i--){
            System.out.print(array[i]+" ");
        }
    }
}