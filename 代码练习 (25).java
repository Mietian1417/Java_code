//请实现一个函数，将一个字符串中的每个空格替换成“%20”。
例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。

import java.util.*;
 
 
public class Solution {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     *
     * @param s string字符串
     * @return string字符串
     */
    public String replaceSpace (String s) {
        // write code here
        int length = s.length();
        char[] c = new char[length * 3];
        int c_index = 0;
        for (int i = 0; i < length; i++) {
            // 若为空格
            if (s.charAt(i) == ' ') {
                c[c_index++] = '%';
                c[c_index++] = '2';
                c[c_index++] = '0';
                // 若不为空格
            }else {
                c[c_index++] = s.charAt(i);
            }
        }
        // 字符数组转字符串
        return new String(c, 0, c_index);
    }
}