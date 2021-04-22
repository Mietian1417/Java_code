//自幂数
/*
public class test {
    public static void main(String[] args) {
        for (int i = 0; i < 999999; i++) {
            int temp = i;
            int count = 0;
            while (temp != 0) {
                temp /= 10;
                count++;
            }
            //求自幂数
            temp = i;
            int sum = 0;
            while (temp != 0) {
                sum += Math.pow(temp % 10, count);
                temp /= 10;
            }
            if (i == sum) {
                System.out.println("自幂数有：" + i);
            }
        }
    }
}
*/

//猜数字小游戏
/*
import java.util.Scanner;
import java.util.Random;

public class test {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("这里是猜数字游戏！");
        System.out.print("请输入一个你猜的数字：");
        Random rand = new Random();
        int seed = rand.nextInt(100);
        while (1 == 1) {
            int input = reader.nextInt();
            if (input == seed) {
                System.out.println("恭喜你，猜对了！");
                break;
            } else if (input > seed) {
                System.out.println("猜大了！");
            } else {
                System.out.println("猜小了！");
            }
        }
    }
}
*/


//分开一个数的二进制奇偶位
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int a = reader.nextInt();
        System.out.print("奇数位：");
        for (int i = 30; i >= 0; i -= 2) {
            System.out.print(((a >>> i) & 1) + " ");
        }
        System.out.println();
        System.out.print("偶数位：");
        for (int i = 31; i >= 0; i -= 2) {
            System.out.print(((a >>> i) & 1) + " ");
        }
    }
}
