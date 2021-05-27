//给你两个字符串数组 word1 和 word2 。如果两个数组表示的字符串相同，返回 true ；否则，返回 false 。
//
//数组表示的字符串 是由数组中的所有元素 按顺序 连接形成的字符串。
//
//来源：力扣（LeetCode）
//链接：https://leetcode-cn.com/problems/check-if-two-string-arrays-are-equivalent
//著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。

/*
class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        if (word1.length == 0 && word2.length == 0) {
            return true;
        }
        if (word1 == null && word2 == null) {
            return true;
        }
        if (word1.length == 0 || word2.length == 0) {
            return false;
        }
        if (word1 == null || word2 == null) {
            return false;
        }
        String str1 = null;
        String str2 = null;
        for (int i = 0; i < word1.length; i++) {
            str1 += word1[i];
        }
        for (int i = 0; i < word2.length; i++) {
            str2 += word2[i];
        }
        if (str1.equals(str2)) {
            return true;
        }
        return false;
    }
}*/

//不借用任何字符串库函数实现无冗余地接受两个字符串，
//然后把它们无冗余的连接起来。
//输入描述：
//每一行包括两个字符串，长度不超过100。
//输出描述：
//可能有多组测试数据，对于每组数据，
//把它们无冗余的连接起来。 输出连接后的字符串。

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String str = scanner.nextLine();
            String[] ss = str.split(" ");
            String ret = "";
            for (String s : ss) {
                ret += s;
            }
            System.out.println(ret);
        }
    }
}