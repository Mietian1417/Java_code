// 输入一个班级5个学生各5科成绩，输出5个学生各5科成绩及总分。
// 输入描述:
// 五行，每行输入一个学生各5科成绩（浮点数表示，范围0.0~100.0），用空格分隔。
// 输出描述:
// 五行，按照输入顺序每行输出一个学生的5科成绩及总分（小数点保留1位），用空格分隔。
/*
import java.util.*;
public class test{
    public static void main(String[] args){
        Scanner reader=new Scanner(System.in);
        float[][] array=new float[5][5];
        float[] sum=new float[5];
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++){
                array[i][j]=reader.nextFloat();
                sum[i]+=array[i][j];
            }
        }
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println(sum[i]);
        }
    }
}*/

//  KiKi得到了一个n行m列的矩阵，现在他想知道第x行第y列的值是多少，请你帮助他完成这个任务。
//  输入描述:
//  第一行包含两个数n和m，表示这个矩阵包含n行m列。从2到n+1行，每行输入m个整数（范围-231~231-1），
//  用空格分隔，共输入n*m个数，表示矩阵中的元素。
//  接下来一行输入x和y，用空格分隔，表示KiKi想得到的元素的位置。(1≤x≤n≤10，1≤y≤m≤10)
//  输出描述:
//  一行，输出一个整数值，为KiKi想知道的值。
/*
import java.util.*;
public class test{
    public static void main(String[] args){
        Scanner reader=new Scanner(System.in);
        int n=reader.nextInt();
        int m=reader.nextInt();
        int[][] array=new int[n][m];
        for(int i = 0;i<array.length;i++){
            for(int j =0;j<array[i].length;j++){
                array[i][j]=reader.nextInt();
            }
        }
        int x=reader.nextInt();
        int y=reader.nextInt();
        System.out.println(array[x-1][y-1]);
    }
}
*/
// KiKi现在得到一个包含n*m个数的整数序列，现在他需要把这n*m个数按顺序规划成一个n行m列的矩阵并输出，请你帮他完成这个任务。
// 输入描述:
// 一行，输入两个整数n和m，用空格分隔，第二行包含n*m个整数（范围-231~231-1）。(1≤n≤10, 1≤m≤10)
// 输出描述:
// 输出规划后n行m列的矩阵，每个数的后面有一个空格。
/*
import java.util.*;
public class test{
    public static void main(String[] args){
        Scanner reader=new Scanner(System.in);
        int n=reader.nextInt();
        int m=reader.nextInt();
        int[][] array=new int[n][m];
        for(int i = 0;i<array.length;i++){
            for(int j =0;j<array[i].length;j++){
                array[i][j]=reader.nextInt();
            }
        }
        for(int i = 0;i<array.length;i++){
            for(int j =0;j<array[i].length;j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }
}*/


// KiKi想从n行m列的方阵队列中找到身高最高的人的位置，请你帮助他完成这个任务。
//输入描述:
//第一行包含两个整数n和m，表示这个方阵队列包含n行m列。从2到n+1行，每行输入m个整数（范围-231~231-1），
// 用空格分隔，共输入n*m个数，表示方阵中的所有人的身高（保证输入身高都不相同）。(1≤x≤n≤10，1≤y≤m≤10)。
//输出描述:
//一行，输出两个整数，用空格分隔，表示方阵中身高最高的人所在的行号和列号。
/*
import java.util.*;
public class test{
    public static void main(String[] args){
        Scanner reader=new Scanner(System.in);
        int n=reader.nextInt();
        int m=reader.nextInt();
        int[][] array=new int[n][m];
        for(int i = 0;i<array.length;i++){
            for(int j =0;j<array[i].length;j++){
                array[i][j]=reader.nextInt();
            }
        }
        int max=0;
        int x=0;
        int y=0;
        for(int i = 0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++){
                if(array[i][j]>max){
                    max=array[i][j];
                    x=i;
                    y=j;
                }
            }
        }
        System.out.println(x+1+" "+(y+1));
    }
}
*/

// KiKi得到了两个n行m列的矩阵，他想知道两个矩阵是否相等，请你回答他。(当两个矩阵对应数组元素都相等时两个矩阵相等)。
// 输入描述:
// 第一行包含两个整数n和m，表示两个矩阵包含n行m列，用空格分隔。
// 从2到n+1行，每行输入m个整数（范围-231~231-1），用空格分隔，共输入n*m个数，表示第一个矩阵中的元素。
// 从n+2行到2n+1，每行输入m个整数（范围-231~231-1），用空格分隔，共输入n*m个数，表示第二个矩阵中的元素。
// 1 < n,m < 10
// 输出描述:
// 一行，如果两个矩阵相等输出"Yes"并换行，否则输出"No"并换行。
/*import java.util.*;

public class test {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        boolean condition = true;
        int n = reader.nextInt();
        int m = reader.nextInt();
        int[][] array1 = new int[n][m];
        int[][] array2 = new int[n][m];
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                array1[i][j] = reader.nextInt();
            }
        }
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                array2[i][j] = reader.nextInt();
                if (array1[i][j] != array2[i][j]) {
                    condition = false;
                    break;
                }
            }
        }
        if (condition == true) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}*/

// KiKi想知道一个n阶方矩是否为上三角矩阵，请帮他编程判定。上三角矩阵即主对角线以下的元素都为0的矩阵，主对角线为从矩阵的左上角至右下角的连线。
// 输入描述:
// 第一行包含一个整数n，表示一个方阵包含n行n列，用空格分隔。 (1≤n≤10)
// 从2到n+1行，每行输入n个整数（范围-231~231-1），用空格分隔，共输入n*n个数。
// 输出描述:
// 一行，如果输入方阵是上三角矩阵输出"YES"并换行，否则输出"NO"并换行。
/*import java.util.*;

public class test {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        boolean condition = true;
        int n = reader.nextInt();
        int[][] array = new int[n][n];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = reader.nextInt();
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; i > j; j++) {
                if (array[i][j] != 0) {
                    condition = false;
                    break;
                }
            }
        }
        if (condition) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}*/

// KiKi有一个矩阵，他想知道转置后的矩阵（将矩阵的行列互换得到的新矩阵称为转置矩阵），请编程帮他解答。
// 输入描述:
// 第一行包含两个整数n和m，表示一个矩阵包含n行m列，用空格分隔。 (1≤n≤10,1≤m≤10)
// 从2到n+1行，每行输入m个整数（范围-231~231-1），用空格分隔，共输入n*m个数，表示第一个矩阵中的元素。
// 输出描述:
// 输出m行n列，为矩阵转置后的结果。每个数后面有一个空格。
/*import java.util.*;

public class test {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        boolean condition = true;
        int n = reader.nextInt();
        int m = reader.nextInt();
        int[][] array = new int[n][m];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = reader.nextInt();
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(array[j][i] + " ");
            }
            System.out.println();
        }
    }
}*/

// KiKi有一个矩阵，他想知道经过k次行变换或列变换后得到的矩阵。请编程帮他解答。
// 输入描述:
// 第一行包含两个整数n和m，表示一个矩阵包含n行m列，用空格分隔。 (1≤n≤10,1≤m≤10)
// 从2到n+1行，每行输入m个整数（范围-231~231-1），用空格分隔，共输入n*m个数，表示第一个矩阵中的元素。
// 接下来一行输入k，表示要执行k次操作（1≤k≤5）。接下来有k行，每行包括一个字符t和两个数a和b，
// 中间用空格格分隔，t代表需要执行的操作，当t为字符'r'时代表进行行变换，
// 当t为字符'c'时代表进行列变换，a和b为需要互换的行或列（1≤a≤b≤n≤10，1≤a≤b≤m≤10）。
// 输出描述:
// 输出n行m列，为矩阵交换后的结果。每个数后面有一个空格。

/*import java.util.*;

public class test {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        boolean condition = true;
        int n = reader.nextInt();
        int m = reader.nextInt();
        int[][] array = new int[n][m];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = reader.nextInt();
            }
        }
        int count = reader.nextInt();
        for (int k = count; count > 0; count--) {
            char t = reader.next().charAt(0);
            int x = reader.nextInt() - 1;
            int y = reader.nextInt() - 1;
            if (t == 'r') {
                for (int j = 0; j < m; j++) {
                    int temp = array[x][j];
                    array[x][j] = array[y][j];
                    array[y][j] = temp;
                }
            } else if (t == 'c') {
                for (int i = 0; i < n; i++) {
                    int temp = array[i][x];
                    array[i][x] = array[i][y];
                    array[i][y] = temp;
                }
            } else {
                break;
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}*/

// 打印杨辉三角
// 输入描述:
// 第一行包含一个整数数n。 (1≤n≤30)
// 输出描述:
// 包含n行，为杨辉三角的前n行，每个数输出域宽为5。

//1.方法一
/*import java.util.*;

public class test {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();
        int[][] array = new int[30][30];
        for (int i = 0; i < 30; i++) {
            for (int j = 0; j < 30; j++) {
                array[i][j] = 1;
            }
        }
        for (int i = 2; i < n; i++) {
            for (int j = 1; j < i; j++) {
                array[i][j] = array[i - 1][j - 1] + array[i - 1][j];
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.printf("%5d", array[i][j]);
            }
            System.out.println();
        }
    }
}*/

//2.方法二
//倒置相加，从后向前填，避免上一行的数据在使用前就被覆盖
import java.util.*;

public class test {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();
        int[] array = new int[n];
        array[0] = 1;
        System.out.println("\t" + array[0]);
        for (int i = 1; i < n; i++) {
            for (int j = i; j > 0; j--) {
                array[j] = array[j - 1] + array[j];
            }
            for (int j = 0; j <= i; j++) {
                System.out.printf("%5d", array[j]);
            }
            if (i != n - 1) {
                System.out.println();
            }
        }

    }
}