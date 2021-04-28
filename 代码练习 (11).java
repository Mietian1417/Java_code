// 实现函数 int sqrt(int x).
//计算并返回x的平方根（向下取整）
/*
import java.time.*;

public class Test {
    public int sqrt(int x) {
        int i = 1;
        int res = 0;
        while (x >= 0) {
            x -= i;
            res++;
            i += 2;
        }
        return res - 1;
    }
}
*/

//转换罗马数字（1-4000）
import java.util.*;

public class Test {
    public String intToRoman(int num) {
        StringBuilder sb = new StringBuilder();
        String[] signs = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        int[] values =   {1000,900,500, 400,100, 90,  50, 40,  10, 9,   5,  4,   1};
        for (int i = 0; num!=0; i++) {
            while (num>=values[i]){
                num -= values[i];
                sb.append(signs[i]);
            }
        }

        return sb.toString();
    }
}