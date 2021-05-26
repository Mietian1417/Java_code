package 字符串的常见操作.字符串拆分;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 陈子豪
 * Date: 2021-05-26
 * Time: 20:58
 */
public class Test {
    public static void main(String[] args) {
        //public String[] split(String regex)
        //将字符串全部拆分
        String str1="12@1417@com";
        System.out.println(Arrays.toString(str1.split("@")));

        //public String[] split(String regex, int limit)
        //将字符串部分拆分，该数组长度就是limit极限(limit为数组长度或分割次数)
        System.out.println(Arrays.toString(str1.split("@", 2)));  //[12, 1417@com]
        System.out.println(Arrays.toString(str1.split("@", 3)));  //[12, 1417, com]

        //字符 | , * + 转移都要加上转义字符，前面加上 \
        //如果是 "" 就是写成 "\\"
        //如果字符串中有多个分隔符，可以用 “|” 作为连字符

//        String str2="192\254\12";  //  无法表示\ ，要写成\\
//        System.out.println(Arrays.toString(str1.split("\\")));

        String str2="192\\254\\12";
        System.out.println(Arrays.toString(str2.split("\\\\")));

        String str3="14.256.32";
        //表示 \ 为要用 \\  ，而 . 也要转义，这里转义里两次
        System.out.println(Arrays.toString(str3.split("\\.")));

        //多个分割
        String str4="1415-658#52";
        System.out.println(Arrays.toString(str4.split("-|#")));

        String s1="name=zhangsan&age=18";
        String[] s2= s1.split("&");
        for (String ss: s2) {
            String[] s2s=ss.split("=");
            for(String s:s2s){
                System.out.println(s);
            }
        }
    }
}
