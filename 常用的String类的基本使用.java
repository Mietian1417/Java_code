//String类的常见操作
public class test {
    public static void main(String[] args) {
        String str1 = "abcdabcdefab";
        //方法声明     int indexOf(int ch)
        //方法功能     返回指定字符在此字符串中第一次出现出的索引
        System.out.println("字符c第一次出现的角标为：" + str1.indexOf('c'));

        String str2 = "ababcdac";
        //方法声明     int lastIndexOf(int ch)
        //方法功能     返回指定字符在此字符串中最后一次出现处的索引
        System.out.println("字符a最后出现一次的角标为：" + str2.lastIndexOf('a'));

        String str3 = "sdababcab";
        //方法声明     int indexOf(String str)
        //方法功能     返回指定子字符串在此字符串中第一次出现处的索引
        System.out.println("子字符串abc第一次出现的角标为：" + str3.indexOf("abc"));

        String str4 = "abcababce";
        //方法声明     int lastIndexOf(String str)
        //方法功能     返回指定子字符串在此字符串中最后一次出现处的索引
        System.out.println("子字符串abc最后一次出现的角标为：" + str4.lastIndexOf("abc"));

        String str5 = "abcdefghij";
        //方法声明     char charAt(int index)
        //方法功能     返回字符串在index位置上的字符，其中index的取值范围是：0-（字符串长度 - 1 ）
        System.out.println("字符串中的第五个字符为：" + str5.charAt(5));

        String str6 = "Hello world!";
        //方法声明     int length()
        //方法功能     返回此字符串的长度
        System.out.println("字符串的长度为：" + str6.length());

        String str7 = "abcdefg";
        //方法声明     boolean endsWith(String suffix)
        //方法功能     判断此字符串是否以指定的字符串结尾
        System.out.println("判断是否以字符串fa结尾：" + str7.endsWith("f"));
        System.out.println("判断是否以字符串fab结尾：" + str7.endsWith("fg"));

        String str8 = "abcd";
        String str9 = "abcde";
        String str10 = "abcd";
        //方法声明     boolean equals(Object anObject)
        //方法功能     将此字符串与指定的字符串比较
        System.out.println("判断两个字符串是否相等：" + str8.equals(str9));
        System.out.println("判断两个字符串是否相等：" + str8.equals(str10));
        /*注：在程序中可以通过 ==和 equals()方法两种方式对字符串进行比较，但这两种方式有明显的区别。
        String类中的equals()方法用于比较两个字符串的字符值是否相等，
        而 ==方法是用于比较两个字符串对象的内存地址是否相同。*/

        String str11 = "abc";
        String str12 = "";
        //方法声明    boolean isEmpty()
        //判断字符串长度是否为0，且只有字符串长度为0时才会返回true
        System.out.println("判断字符串长度是否为0：" + str11.isEmpty());
        System.out.println("判断字符串长度是否为0：" + str12.isEmpty());

        String str13 = "cdefg";
        //方法声明    boolean startsWith(String prefix)
        //方法功能    判断此字符串是否以指定的字符串开始
        System.out.println("判断字符串是否以ce开始：" + str13.startsWith("ce"));
        System.out.println("判断字符串是否为cd开始：" + str13.startsWith("cd"));

        String str15 = "abdfg";
        //方法声明    boolean contains(CharSequence cs)
        //方法功能    判断此字符串是否包含指定的字符序列
        System.out.println("判断字符串是否包含ad：" + str15.contains("ad"));
        System.out.println("判断字符串是否包含bd：" + str15.contains("bd"));

        String str16 = "MyName";
        //方法声明    String toLowerCase()
        //方法功能    使用默认语言环境的规则将String中的所有字符都转换成小写
        System.out.println("字符串转换成小写为：" + str16.toLowerCase());

        String str17 = "MyAge";
        //方法声明    String toUpperCase()
        //方法功能    使用默认语言环境的规则将String中的所有字符都转换成小写
        System.out.println("字符串转换成大写为：" + str17.toUpperCase());

        //方法声明    static String valueOf(int i)
        //方法功能    返回int参数的字符串表示形式（将数字转换成字符串）
        System.out.println("6数字对应的字符串为：" + String.valueOf(6));
        //注：这里输出的6是一个字符串，相当于 "6"

        String str18 = "aabbcd";
        //方法声明    char[] toCharArray()
        //方法功能    将此字符串转换成一个字符数组
        char[] array = str18.toCharArray();
        System.out.print("数组array的内容为：");
        for (char x : array
        ) {
            System.out.print(x + " ");
        }
        System.out.println();

        //方法声明    String replace(CharSequence oldstr,CharSequence newstr)
        //方法功能    返回一个新的字符串，它是通过用newstr替换此字符串中出现的所有oldstr得到的
        String str19 = "abcd  :  1417";
        System.out.println(str19.replace(" ", ""));

        //方法声明    String[] split(String regex)
        //方法功能    根据参数regex将字符串分割成若干个子字符串（regex是一个正则表达式，用来限定分割规则）
        String str20 = "2021:4:23";
        String[] strArray = str20.split(":");
        System.out.print("strArray数组内容为：");
        for (String s : strArray) {
            System.out.print(s + " ");
        }
        System.out.println();

        String str21 = "ahijksasd";
        //方法声明    String substring(int beginIndex)
        //返回一个新字符串，它包含从指定的beginIndex起始角标处开始，直到此字符串末尾的所有字符
        System.out.println("从角标3开始的新字符串：" + str21.substring(3));

        String str22 = "efghijklmn";
        //方法声明    String substring(int beginIndex,int endIndex)
        //方法功能    返回一个新字符串，它包含从指定的beginIndex起始角标处开始，直到索引endIndex-1角标处的所有字符
        System.out.println("从角标3开始到角标8的新字符串：" + str22.substring(3, 8));

        //方法声明    String trim()
        //方法功能    返回一个新字符串，它去除了原字符串首尾的空字符（只能去除首尾空字符）
        String str23 = "   How are you?   ";
        System.out.println("去除字符串两端的空字符后：" + str23.trim());
    }
}