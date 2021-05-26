package 字符串的常见操作.字符串比较;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 陈子豪
 * Date: 2021-05-26
 * Time: 20:26
 */
public class Test {
    public static void main(String[] args) {
        //public boolean equals(Object anObject)
        //区分大小写的比较
        String str1=new String("hello");
        String str2="Hello";
        System.out.println(str1.equals(str2));
        System.out.println(str1.equals("hello"));
        System.out.println("HELLO".equals(str2));

        //public boolean equalsIgnoreCase(String anotherString)
        //不区分大小写的比较
        System.out.println(str1.equalsIgnoreCase(str2));
        System.out.println(str1.equalsIgnoreCase("hello"));
        System.out.println("HELLO".equalsIgnoreCase(str2));

        //public int compareTo(String anotherString)
        //比较两个字符串的大小关系
        String str3="abc";
        String str4="bcd";
        String str5="你好";  //比较对应的Unicode值

        String str6="好的";
        System.out.println(str3.compareTo(str5));
        System.out.println(str5.compareTo(str6));
    }
}

