package 日常练习.字符集合;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 陈子豪
 * Date: 2021-06-09
 * Time: 16:09
 */

//链接：https://www.nowcoder.com/questionTerminal/784efd40ed8e465a84821c8f3970b7b5
//来源：牛客网
//
//输入一个字符串，求出该字符串包含的字符集合
//
//输入描述:
//
//每组数据输入一个字符串，字符串最大长度为100，且只包含字母，不可能为空串，区分大小写。
//
//
//
//输出描述:
//
//每组数据一行，按字符串原有的字符顺序，输出字符集合，即重复出现并靠后的字母不输出。

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String str = scanner.nextLine();
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < str.length(); i++) {
                if (!sb.toString().contains(str.charAt(i) + "")) {
                    sb.append(str.charAt(i));
                }
            }
            System.out.println(sb.toString());
        }
    }
}