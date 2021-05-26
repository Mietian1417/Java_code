package 字符串的常见操作.字符串查找;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 陈子豪
 * Date: 2021-05-26
 * Time: 20:27
 */
public class Test {
    public static void main(String[] args) {
        //public boolean contains(CharSequence s)
        //判断一个子字符串是否存在
        String str1="abcdefg";
        String str2="abc";
        System.out.println(str1.contains(str2));

        //public int indexOf(String str)
        //从头开始查找指定字符串的位置，查到了就返回位置的开始索引，
        //如果查不到就返回 -1
        String str3="Hello";
        System.out.println(str3.indexOf("llo"));

        //public int indexOf(String str, int formIndex)
        //从指定位置开始查找子字符串的位置
        String str4="hello world";
        String str5="world";
        String str6="world";
        System.out.println(str4.indexOf(str5, 2));
        System.out.println(str4.indexOf(str5, 4));

        //public int lastIndexOf(String str)
        //从后向前查找子字符串位置
        String str7="abcdefgh";
        System.out.println(str7.lastIndexOf("ed"));

        //public int lastIndexOf(String str, int formIndex)
        //从指定位置由后向前查找
        System.out.println(str7.lastIndexOf("def", 3));
        System.out.println(str7.lastIndexOf("def", 5));

        //public boolean startsWith(String prefix)
        //判断是否以指定字符串开头
        String str8="hello";
        System.out.println(str8.startsWith("h"));
        System.out.println(str8.startsWith("e"));

        //public boolean startsWith(String prefix, int toffset)
        //从指定位置开始判断是否以指定字符串开头
        System.out.println(str8.startsWith("he",3));
        System.out.println(str8.startsWith("llo",2));

        //public boolean endsWith(String suffix)
        //判断是否以指定字符串结尾
        String str9="hello world";
        System.out.println(str9.endsWith("ldd"));
        System.out.println(str9.endsWith("world"));
    }
}
