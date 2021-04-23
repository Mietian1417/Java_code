// 小乐乐获得4个最大数，请帮他编程找到最大的数。
// 输入描述:
// 行，4个整数，用空格分开。
// 输出描述:
// 一行，一个整数，为输入的4个整数中最大的整数。
/*
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[4];
        int max = 0;
        for (int i = 0; i < 4; i++) {
            num[i] = sc.nextInt();
            if (max < num[i]) {
                max = num[i];
            }
        }
        System.out.println(max);

    }
}*/

//求1-100的素数
/*
public class test {
    public static void main(String[] args) {
        int i = 0;
        int j = 0;
        for (i = 1; i < 100; i++) {
            for (j = 2; j < i; j++) {
                if (i % j == 0) {
                    break;
                }
            }
            if (i == j) {
                System.out.printf("%d ", i);
            }
        }
    }
}
*/

//求1000-2000的闰年
/*
public class test {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1000; i <= 2000; i++) {
            if ((i % 100 == 0) || (i % 4 == 0 && i % 100 != 0)) {
                System.out.printf("%d ", i);
                count++;
                if (count % 10 == 0) {
                    System.out.println();
                }
            }
        }
    }
}
*/

//求1-100中9个个数
public class test {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 9 == 0 || i / 10 == 9) {
                count++;
            }
        }
        System.out.println(count);
    }
}