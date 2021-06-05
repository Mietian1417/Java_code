package Collection.List接口.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 陈子豪
 * Date: 2021-06-05
 * Time: 15:43
 */

/*删除第一个字符串当中出现的第一个字符串中的字符
 * 例如：
 * String str1 = "welcome to bit";
 * String str2=  "come";
 * 输出结果：wl t bit*/

public class ArrayListTest3 {
    public static void main(String[] args) {
        String str1 = "welcome to bit";
        String str2 = "come";

        //方法一：
       /* StringBuilder stringBuilder = new StringBuilder(str1);
        for (int i = 0; i < str1.length(); i++) {
            for (int j = 0; j < str2.length(); j++) {
                if (str1.charAt(i) == str2.charAt(j)) {
                   stringBuilder.replace(i,i+1,"0");
                   break;
                }
            }
        }
        System.out.println(stringBuilder.toString());
        String str3 = stringBuilder.toString();
        System.out.println( str3.replaceAll("0",""));*/

        //方法二：
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < str1.length(); i++) {
            if (!str2.contains(str1.charAt(i) + "")) {
                stringBuilder.append(str1.charAt(i));
            }
        }
        System.out.println(stringBuilder.toString());
    }
}
