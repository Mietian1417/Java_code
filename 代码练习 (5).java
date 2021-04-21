// 在庆祝祖国母亲70华诞之际，老师给小乐乐出了一个问题。大家都知道China的英文缩写是CHN，
// 那么给你一个字符串s，你需要做的是统计s中子串“CHN”的个数。
// 子串的定义：存在任意下标a < b < c，那么“s[a]s[b]s[c]”就构成s的一个子串。
// 如“ABC”的子串有“A”、“B”、“C”、“AB”、“AC”、“BC”、“ABC”。
// 输入描述:
// 输入只包含大写字母的字符串s。(1 ≤ length ≤ 8000)
// 输出描述:
// 输出一个整数，为字符串s中字串“CHN”的数量。
/*
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String s = reader.next();
        long C = 0, CH = 0, CHN = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'C')
                C++;
            else if (s.charAt(i) == 'H')
                CH += C;
            else if (s.charAt(i) == 'N')
                CHN += CH;
        }
        System.out.println(CHN);
    }
}
*/

// KiKi学习了面向对象技术，学会了通过封装属性（变量）和行为（函数）定义类，现在他要设计一个电子日历类TDate。
//它有3个私有数据成员：Month,Day,Year和若干个公有成员函数，要求：
//（1）带有默认形参值的构造函数，默认值为0, 0, 0；
//（2）输出日期函数，用“日/月/年”格式输出日期；
//（3）设置日期函数，从键盘输入年、月、日。
//输入描述:
//一行，三个整数，用空格分隔，分别表示年、月、日。
//输出描述:
//一行，用“日/月/年”格式输出日期。

/*
import java.util.*;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        int month = sc.nextInt();
        int day = sc.nextInt();
        TDate td = new TDate(day, month, year);
        td.print();
    }

    static class TDate {
        private int Month = 0;
        private int Day = 0;
        private int Year = 0;

        public TDate(int day, int month, int year) {
            this.Month = month;
            this.Day = day;
            this.Year = year;
        }

        public void print() {
            System.out.println(Day + "/" + Month + "/" + Year);
        }
    }
}
*/

//给定一个整数序列，KiKi想把其中的重复的整数去掉，并将去重后的序列从小到达排序输出。
//输入描述:
//第一行，输入一个整数n，表示序列有n个整数。
//第二行输入n个整数（每个整数大于等于1，小于等于1000），整数之间用空格分隔。
//输出描述:
//去重并且从小到大排列的整数序列，整数之间用空格分隔。

/*
import java.util.*;

public class test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] array= new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scan.nextInt();
        }
        for (int i = 0; i < array.length-1 ; i++) {
            for (int j = 0; j < array.length-1-i ; j++) {
                if(array[j]>array[j+1]){
                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }
        System.out.print(array[0] + " ");
        for (int i = 1; i < array.length; i++) {
            if (array[i] != array[i - 1]) {
                System.out.print(array[i] + " ");
            }
        }
    }
}*/


// KiKi这学期努力学习程序设计基础，要期末考试了，BoBo老师告诉他，总成绩包括四个部分，如下：
//总成绩 = 实验成绩 * 20% + 课堂表现成绩 * 10% + 过程考核成绩 * 20% + 期末上机考试成绩 * 50%，现在输入KiKi的各项成绩，请计算KiKi的总成绩。
//输入描述:
//一行，包括四个整数（百分制），用空格分隔，分别表示实验成绩，课堂表现成绩，过程考核成绩，期末上机考试成绩。
//输出描述:
//一行，总成绩，保留小数点一位。

/*
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score1 = sc.nextInt();
        int score2 = sc.nextInt();
        int score3 = sc.nextInt();
        int score4 = sc.nextInt();

        double sum = score1 * 0.2 + score2 * 0.1 + score3 * 0.2 + score4 * 0.5;
        System.out.println(String.format("%.1f", sum));
    }
}*/


//小乐乐输入百分制成绩，他想将成绩转换成等级制。转换规则为：90-100为’A’，80-89为’B’，70-79为’C’，60-69为’D’，59以下为’E’。如果输入的成绩不在0-100之间，输出’F’。
//输入描述:
//一行，一个整数表示的成绩。
//输出描述:
//一行，转换后的等级。


import java.util.*;

public class test {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int grade = s.nextInt();
        if (grade >= 0 && grade <= 100) {
            switch (grade / 10) {
                case 10:
                case 9:
                    System.out.println('A');
                    break;
                case 8:
                    System.out.println('B');
                    break;
                case 7:
                    System.out.println('C');
                    break;
                case 6:
                    System.out.println('D');
                    break;
                default:
                    System.out.println('E');
                    break;
            }
        } else
            System.out.println('F');
        s.close();
    }
}

