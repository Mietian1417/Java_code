import java.util.*;
//遍历二维数组的内存
public class test{
    public static void main(String[] args) {
        //二维数组的定义方法及其初始化

        //不规则数组的初始化
        int[][] array=new int[3][];
        array[0]=new int[3];
        array[1]=new int[2];
        array[2]=new int[1];
        Scanner reader=new Scanner(System.in);
        for (int i = 0; i <array.length ; i++) {
            for (int j = 0; j <array[i].length ; j++) {
                array[i][j]=reader.nextInt();
            }
        }
        //int[][] array=new int[2][3];

        //int[][] array={{1,2,3},{4,5},{6}};

        //int[][] array=new int[][]{{1,2,3},{4,5},{6}};
        //1.普通遍历
        /*for (int i = 0; i <array.length ; i++) {
            for (int j = 0; j <array[i].length ; j++) {
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }*/

        //2.一个foreach遍历多个一维数组再由toString输出每个数组
        /*for (int[] arr:array) {
            System.out.println(Arrays.toString(arr));
        }*/

        //3.两个foreach遍历二维数组
       /* for (int[] arr:array) {
            for (int x:arr) {
                System.out.print(x+" ");
            }
            System.out.println();
        }*/

        //4.deepToString打印二维数组
        //System.out.println(Arrays.deepToString(array));
    }
}