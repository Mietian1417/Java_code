//现在有一个整数类型的数组，数组中素只有一个元素只出现一次，其余的元素都出现两次。
/*
import java.util.*;

public class test {
    public int singleNumber(int[] A) {
        int once = 0;
        for (int i = 0; i < A.length; i++) {
            once ^= A[i];
        }
        return once;
    }
}
*/

// 假设你有一个数组，其中第 i\ i i 个元素是股票在第 i\ i i 天的价格。
// 你有一次买入和卖出的机会。（只有买入了股票以后才能卖出）。请你设计一个算法来计算可以获得的最大收益。
/*
import java.util.*;

public class test {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) {
            return 0;
        }
        int max = 0;
        int min = prices[0];
        for (int i = 0; i < prices.length; i++) {
            min = Math.min(min, prices[i]);
            max = Math.max(max, prices[i] - min);
        }
        return max;
    }
}
*/
