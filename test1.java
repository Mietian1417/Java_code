import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner reader=new Scanner(System.in);
        int positive =0;
        int negative =0;
        int[] array=new int[10];
        for(int i=0;i<10;i++){
            array[i]=reader.nextInt();
        }
        for(int i=0;i<10;i++){
            if(array[i]>0){
                positive++;
            }
            else{
                negative++;
            }
        }
        System.out.println("positive:"+positive);
        System.out.println("negative:"+negative);
    }
}