// 用字符串模拟这个指令的运算结果。对于一个给定的字符序列S，
// 请你把其循环左移K位后的序列输出。例如，字符序列S=”abcXYZdef”,
// 要求输出循环左移3位后的结果，即“XYZdefabc”。是不是很简单？OK，搞定它！
public class Solution {
    public String LeftRotateString(String str,int n) {
        int len = str.length();
        if(len == 0){
            return "";
        }
        int trueSet = n % len;
        if(n == 0 || len <= 1)//空串和单字符串左移无意义
            return str;
        return str.substring(n) + str.substring(0, n);
    }
}
