package 字符串的常见操作.其他的操作方法;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 陈子豪
 * Date: 2021-05-27
 * Time: 18:27
 */
public class Test {
    public static void main(String[] args) {
        //public String trim()
        //去掉字符串开头和末尾的空格，保留中间空格
        String str1=" Hello world! ";
        System.out.println(str1.trim());

        //public String toUpperCase()
        //字符串转大写
        System.out.println(str1.toUpperCase());

        //public String toUpperCase()
        //字符串转大写
        System.out.println(str1.toLowerCase());

        //public native String intern()
        //字符串入池操作
        String str2=str1.intern();
        System.out.println(str2);

        //public String contact (String str)
        //字符串连接，等同于"+"，不如池
        String str3="he";
        String str4="llo";
        System.out.println(str3.concat(str4));

        //public int length()
        //取得字符串的长度
        System.out.println(str3.length());
        System.out.println(str4.length());
        System.out.println(str3.concat(str4).length());

        //public boolean isEmpty()
        //判断是否为空字符串，长度为0的字符串，不是null
        String str5="";
        String str6=" ";
        System.out.println(str5.isEmpty());
        System.out.println(str6.isEmpty());
    }
}
