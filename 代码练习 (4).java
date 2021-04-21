// KiKi和BoBo玩 “井”字棋。也就是在九宫格中，只要任意行、列，或者任意对角线上面出现三个连续相同的棋子，就能获胜。请根据棋盘状态，判断当前输赢。
// 输入描述:
// 三行三列的字符元素，代表棋盘状态，字符元素用空格分开，代表当前棋盘，其中元素为K代表KiKi玩家的棋子，为O表示没有棋子，为B代表BoBo玩家的棋子。
// 输出描述:
// 如果KiKi获胜，输出“KiKi wins!”；
// 如果BoBo获胜，输出“BoBo wins!”；
// 如果没有获胜，输出“No winner!”。
/*
import java.util.*;
public class test {
    public static char isWin(char[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][0] == array[i][1] && array[i][1] == array[i][2] && array[i][0] != 'O') {
                    return array[i][0];
                }
                if (array[0][j] == array[1][j] && array[1][j] == array[2][j] && array[0][j] != 'O') {
                    return array[0][j];
                }
                if ((array[0][0] == array[1][1] && array[1][1] == array[2][2] && array[0][0] != 'O') ||
                        (array[0][2] == array[1][1] && array[1][1] == array[2][0] && array[0][2] != 'O')) {
                    return array[1][1];
                }
            }
        }
        return 'O';
    }
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        char[][] array = new char[3][3];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = reader.next().charAt(0);
            }
            System.out.println();
        }
        if (isWin(array) == 'K') {
            System.out.println("KiKi wins!");
        } else if (isWin(array) == 'B') {
            System.out.println("BoBo wins!");
        } else {
            System.out.println("No winner!");
        }
    }
}
*/

//上题上进行创新，达到动态下棋的效果

/*
import java.util.*;
public class test {
    //下棋
    public static void playBoard(char[][] array, char ch) {
        Scanner reader = new Scanner(System.in);
        while (true) {
            int x = reader.nextInt();
            int y = reader.nextInt();
            if (x >= 1 && x <= 3 && y >= 1 && y <= 3 && array[x - 1][y - 1] == 'O') {
                array[x - 1][y - 1] = ch;
                break;
            } else {
                System.out.println("请输入无棋子的位置！");
            }
        }
    }
    //判断输赢
    public static String isWin(char[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if ((array[i][0] == array[i][1] && array[i][1] == array[i][2] && array[i][0] != 'O') ||
                        (array[0][j] == array[1][j] && array[1][j] == array[2][j] && array[0][j] != 'O') ||
                        (array[0][0] == array[1][1] && array[1][1] == array[2][2] && array[0][0] != 'O') ||
                        (array[0][2] == array[1][1] && array[1][1] == array[2][0] && array[0][2] != 'O')) {
                    return "win";
                }
            }
        }
        return "noWin";
    }
    //打印棋盘
    public static void printBoard(char[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]);
                if (j != 2) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        char[][] array = new char[3][3];
        int count = 9;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = 'O';
            }
        }
        printBoard(array);
        while (count != 0) {
            playBoard(array, 'B');
            printBoard(array);
            count--;
            if (count == 0) {
                System.out.println("No winner!");
                break;
            }
            if (isWin(array) == "win") {
                System.out.println("BoBo wins!");
                break;
            }
            playBoard(array, 'K');
            printBoard(array);
            count--;
            if (count == 0) {
                System.out.println("No winner!");
                break;
            }
            if (isWin(array) == "win") {
                System.out.println("KiKi wins!");
                break;
            }
        }
    }
}
*/

// 小乐乐最近接触了求和符号Σ，他想计算的结果。但是小乐乐很笨，请你帮助他解答。
// 输入描述:
// 输入一个正整数n  (1 ≤ n ≤ 109)
// 输出描述:
// 输出一个值，为求和结果。
/*
import java.util.*;
public class test {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int input = reader.nextInt();
        long sum = 0;
        for (int i = 1; i <= input; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
*/

// 小乐乐学校教学楼的电梯前排了很多人，他的前面有n个人在等电梯。电梯每次可以乘坐12人，每次上下需要的时间为4分钟（上需要2分钟，下需要2分钟）。请帮助小乐乐计算还需要多少分钟才能乘电梯到达楼上。（假设最初电梯在1层）
// 输入描述:
// 输入包含一个整数n (0 ≤ n ≤ 109)
// 输出描述:
// 输出一个整数，即小乐乐到达楼上需要的时间。
/*
import java.util.*;
public class test {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();
        int minutes = n / 12 * 4;
        if (n < 12) {
            System.out.println("2");
        } else {
            System.out.println(2 + minutes);
        }
    }
}
*/

//求一个数的最大公约数和最小公倍数的和
/*
import java.util.*;
public class test {
    public static void main(String[] agrs) {
        Scanner reader = new Scanner(System.in);
        long a = reader.nextInt();
        long b = reader.nextInt();
        long max = a > b ? a : b;
        long min = a < b ? a : b;
        long tmax = max;
        long tmin = min;
        long temp = 0;
        while (max % min != 0) {
            temp = max % min;
            max = min;
            min = temp;
        }
        long greatest = min;
        long least = 0;
        for (int i = 1; i <= tmin; i++) {
            if (i * tmax % tmin == 0) {
                least = i * tmax;
                break;
            }
        }
        System.out.println(least + greatest);
    }
}*/

//小乐乐喜欢数字，尤其喜欢0和1。他现在得到了一个数，想把每位的数变成0或1。
// 如果某一位是奇数，就把它变成1，如果是偶数，那么就把它变成0。请你回答他最后得到的数是多少。
/*
import java.util.*;
public class test {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();
        int[] array = new int[10];
        int i = 0;
        int m = 0;
        int sum = 0;
        while (n != 0) {
            m = n % 10;
            n /= 10;
            if (m % 2 == 0) {
                array[i] = 0;
            } else {
                array[i] = 1;
            }
            sum += array[i] * Math.pow(10, i);
            i++;
        }
        System.out.println(sum);
    }
}
*/

// 小乐乐上课需要走n阶台阶，因为他腿比较长，所以每次可以选择走一阶或者走两阶，那么他一共有多少种走法？
//输入描述:
//输入包含一个整数n (1 ≤ n ≤ 30)
//输出描述:
//输出一个整数，即小乐乐可以走的方法数。
/*
import java.util.*;
public class test {
    public static int jumpWay(int x) {
        if (x == 1 || x == 2) {
            return x;
        } else {
            return jumpWay(x - 1) + jumpWay(x - 2);
        }
    }
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();
        System.out.println(jumpWay(n));
    }
}
*/
// 老师给了小乐乐一个正整数序列，要求小乐乐把这个序列去重后按从小到大排序。但是老师给出的序列太长了，小乐乐没办法耐心的去重并排序，请你帮助他。
// 输入描述:
// 第一行包含一个正整数n，表示老师给出的序列有n个数。接下来有n行，
// 每行一个正整数k，为序列中每一个元素的值。(1 ≤ n ≤ 105，1 ≤ k ≤ n)
// 输出描述:
// 输出一行，为去重排序后的序列，每个数后面有一个空格。
/*
import java.util.*;
public class test {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = reader.nextInt();
        }
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++)
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    array[j] = 0;
                }
            }
            if (array[i] != 0) {
                System.out.print(array[i] + " ");
            }
        }
    }
}
*/