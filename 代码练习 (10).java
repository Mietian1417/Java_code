//将一个长度最多为30位数字的十进制非负整数转换为二进制数输出。
//输入描述:
//多组数据，每行为一个长度不超过30位的十进制非负整数。
//（注意是10进制数字的个数可能有30个，而非30bits的整数）

/*
import java.util.*;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String str = in.nextLine();
            BigInteger a = new BigInteger(str, 10);
            System.out.println(a.toString(2));
        }
    }
}
*/

//输入任意4个字符(如：abcd)， 并按反序输出(如：dcba)
//输入描述:
//题目可能包含多组用例，每组用例占一行，包含4个任意的字符。

/*
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            StringBuilder sb = new StringBuilder(sc.nextLine());
            System.out.println(sb.reverse().toString());
        }
    }
}
*/

//输入N个（N<=10000）数字，求出这N个数字中的最大值和最小值。每个数字的绝对值不大于1000000。
//输入描述:
//输入包括多组测试用例，每组测试用例由一个整数N开头，接下去一行给出N个整数

/*
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int[] nums = new int[n];
            for (int i = 0; i < n; i++) {
                nums[i] = sc.nextInt();
            }
            Arrays.sort(nums);
            System.out.println(nums[n - 1] + " " + nums[0]);
        }
    }
}
*/
