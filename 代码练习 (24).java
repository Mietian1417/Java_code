// 计算字符串最后一个单词的长度，单词以空格隔开，字符串长度小于5000。
//输入描述:
//输入一行，代表要计算的字符串，非空，长度小于5000。
//输出描述:
//输出一个整数，表示输入字符串最后一个单词的长度。

import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] arr = line.split(" ");
        System.out.println(arr[arr.length-1].length());
         
    }
}