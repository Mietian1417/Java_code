//字符串逆置
/*
public class Solution{
    public String reserve(String str){
        if(str == null){
            return null;
        }
        int i = 0;
        int j = str.length() - 1;
        char[] chars = str.toCharArray();
        while(i < j){
            char temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
            i++;
            j--;
        }
        return new String(chars);
        //return String.valueOf(chars);
    }
}*/


//左旋字符串（n个）
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String str = scan.next();
        String ret = reversSentence(str, n);
        System.out.println(ret);
    }

    public static String reverse(String str, int start, int end) {
        if (str == null) {
            return null;
        }
        char[] chars = str.toCharArray();
        int i = start;
        int j = end;
        while (i < j) {
            char temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
            i++;
            j--;
        }
        return new String(chars);
    }

    public static String reversSentence(String str, int size) {
        if (str == null) {
            return null;
        }
        str = reverse(str, 0, size - 1);
        str = reverse(str, size, str.length() - 1);
        str = reverse(str, 0, str.length() - 1);
        return str;
    }
}