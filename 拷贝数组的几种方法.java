import java.util.*;
public class test{
    public static void main(String[] args){
        int[] array={1,2,3,4,5,6};

//        int[] copy=Arrays.copyOf(array,2);
//        System.out.println(Arrays.toString(copy));

//        int[] copy= Arrays.copyOfRange(array,2,4);
//        System.out.println(Arrays.toString(copy));


//        int[] copy=new int[array.length];
//        System.arraycopy(array,1,copy,2,4);
//        System.out.println(Arrays.toString(copy));
        
        int[] copy=array.clone();
        System.out.println(Arrays.toString(copy));

    }
}