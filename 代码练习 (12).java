// 一个机器人在m×n大小的地图的左上角（起点）。
//机器人每次向下或向右移动。机器人要到达地图的右下角（终点）。
//可以有多少种不同的路径从起点走到终点？
/*
import java.util.*;

public class Solution {
    public int uniquePaths(int m, int n) {
        int[] array = new int[n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0)
                    array[j] = 1;
                else
                    array[j] = array[j - 1] + array[j];
            }
        }
        return array[n - 1];
    }
}
*/

// 将给出的32位整数x翻转。
//例1:x=123，返回321
//例2:x=-123，返回-321
//你有注意到翻转后的整数可能溢出吗？因为给出的是32位整数，
// 则其数值范围为[−231,231−1][−2^{31}, 2^{31} − 1][−231,231−1]。
// 翻转可能会导致溢出，如果反转后的结果会溢出就返回 0。
/*
import java.util.*;

public class Solution {
    public int reverse(int x) {
        if (x == 0)
            return x;

        String num = String.valueOf(x);
        int inx = 0;
        boolean minus = false;
        if (num.charAt(0) == '-') {
            minus = true;
            inx++;
        }
        long res = 0;
        for (int i = num.length() - 1; i >= inx; i--) {
            int flag = minus ? -1 : 1;
            res = res * 10 + flag * (num.charAt(i) - '0');
            if (isOverflow(res))
                return 0;
        }
        return (int) res;
    }

    public boolean isOverflow(long x) {
        if (x > 0) {
            if (x > 0x7fffffff)
                return true;
        } else {
            if (x < 0x80000000)
                return true;
        }
        return false;
    }
}
*/

//假设你有一个数组，其中第i个元素表示某只股票在第i天的价格。
//设计一个算法来寻找最大的利润。你可以完成任意数量的交易(例如，多次购买和出售股票的一股)
//但是，你不能同时进行多个交易(即，你必须在再次购买之前卖出之前买的股票)。

import java.util.*;

class Solution {
    public int maxProfit(int[] prices) {
        int len = prices.length;
        if (len == 0)
            return 0;
        int buyin = prices[0];
        int[] dp = new int[len];
        dp[0] = 0;
        for (int i = 1; i < len; i++) {
            dp[i] = Math.max(dp[i - 1], dp[i - 1] + prices[i] - buyin);
            buyin = prices[i];
        }
        return dp[len - 1];
    }
}