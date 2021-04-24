String类一些常用的方法

在介绍这些方法面前，我们先讲述下String类操作字符串的原则

    String类中的方法操作字符串并不是直接操作字符串的原地址，而是在原地址上进行一些修改，而原数据并没有被改变。
    例：

 String str="Hello world!";
 //toUpperCase()是String类的一个方法，
 //它的作用是将目标字符串中的所有字符转换成大写。
 // （这里只是为了演示效果，在下面会介绍）
 System.out.println(str.toUpperCase());
 System.out.println(str);

 效果如下

 HELLO WORLD!
 Hello world!

 很容易看出str字符串的内容并没有改变。
 下面为了达到更直观的效果，并没有采取对一个对象一直操作， 而是每一个方法创建一个对象。

下面介绍常用方法

    int indexOf(int ch)

 String str1 = "abcdabcdefab";
 //方法功能     返回指定字符在此字符串中第一次出现出的索引
 System.out.println("字符c第一次出现的角标为：" + str1.indexOf('c'));

 字符c第一次出现的角标为：2

    int lastIndexOf(int ch)

 String str2 = "ababcdac";
 //方法功能     返回指定字符在此字符串中最后一次出现处的索引
 System.out.println("字符a最后出现一次的角标为：" + str2.lastIndexOf('a'));

 字符a最后出现一次的角标为：6

    int indexOf(String str)

 String str3 = "sdababcab";
 //方法功能     返回指定子字符串在此字符串中第一次出现处的索引
 System.out.println("子字符串abc第一次出现的角标为：" + str3.indexOf("abc"));

 子字符串abc第一次出现的角标为：4

    int lastIndexOf(String str)

 String str4 = "abcababce";
 //方法功能     返回指定子字符串在此字符串中最后一次出现处的索引
 System.out.println("子字符串abc最后一次出现的角标为：" + str4.lastIndexOf("abc"));

 子字符串abc最后一次出现的角标为：5

    char charAt(int index)

 String str5 = "abcdefghij";
 //方法功能     返回字符串在index位置上的字符，其中index的取值范围是：0-（字符串长度 - 1 ）
 System.out.println("字符串中的第五个字符为：" + str5.charAt(5));

字符串中的第五个字符为：f

    int length()

 String str6 = "Hello world!";
 //方法功能     返回此字符串的长度
 System.out.println("字符串的长度为：" + str6.length());

 字符串的长度为：12

    boolean endsWith(String suffix)

 String str7 = "abcdefg";
 //方法功能     判断此字符串是否以指定的字符串结尾
 System.out.println("判断是否以字符串f结尾：" + str7.endsWith("f"));
 System.out.println("判断是否以字符串fg结尾：" + str7.endsWith("fg"));

 判断是否以字符串f结尾：false
 判断是否以字符串fg结尾：true

    boolean equals(Object anObject)

 String str8 = "abcd";
 String str9 = "abcde";
 String str10 = "abcd";
 //方法功能     将此字符串与指定的字符串比较
 System.out.println("判断两个字符串是否相等：" + str8.equals(str9));
 System.out.println("判断两个字符串是否相等：" + str8.equals(str10));

 判断两个字符串是否相等：false
 判断两个字符串是否相等：true

注：在程序中可以通过 ==和 equals()方法两种方式对字符串进行比较，但这两种方式有明显的区别。
String类中的equals()方法用于比较两个字符串的字符值是否相等，
而 ==方法是用于比较两个字符串对象的内存地址是否相同。
例：

 //String s1="abc";
 //String s2="abc";
 /*其实s1和s2是同一个对象，java程序在执行时，
 会判断是先是否存在同样的字符串，如果存在，就直接共享，不再创建新对象。
 这里为了真正创建两个对象，我们采取用类的方式来创建对象。*/
 String s3=new String("abc");
 String s4=new String("abc");
 //s3和s4是两个对象，结果为false
 System.out.println("两个字符串是否相等："+(s3==s4));
 //s3和s4字符值值相同，结果为true
 System.out.println("两个字符串是否相等："+s3.equals(s4));

 两个字符串是否相等：false
 两个字符串是否相等：true

 很明显可以看出两种比较方式的区别

    boolean isEmpty()

 String str11 = "abc";
 String str12 = "";
 //方法功能    判断字符串长度是否为0，且只有字符串长度为0时才会返回true
 System.out.println("判断字符串长度是否为0：" + str11.isEmpty());
 System.out.println("判断字符串长度是否为0：" + str12.isEmpty());

 判断字符串长度是否为0：false
 判断字符串长度是否为0：true

    boolean startsWith(String prefix)

 String str13 = "cdefg";
 //方法功能    判断此字符串是否以指定的字符串开始
 System.out.println("判断字符串是否以ce开始：" + str13.startsWith("ce"));
 System.out.println("判断字符串是否为cd开始：" + str13.startsWith("cd"));

 判断字符串是否以ce开始：false
 判断字符串是否为cd开始：true

    boolean contains(CharSequence cs)

 String str14 = "abdfg";
 //方法功能    判断此字符串是否包含指定的字符序列
 System.out.println("判断字符串是否包含ad：" + str14.contains("ad"));
 System.out.println("判断字符串是否包含bd：" + str14.contains("bd"));

 判断字符串是否包含ad：false
 判断字符串是否包含bd：true

    String toLowerCase()

 String str15 = "MyName";
 //方法功能    使用默认语言环境的规则将String中的所有字符都转换成小写
 System.out.println("字符串转换成小写为：" + str15.toLowerCase());

 字符串转换成小写为：myname

    String toUpperCase()

 String str16 = "MyAge";
 //方法功能    使用默认语言环境的规则将String中的所有字符都转换成大写 
 System.out.println("字符串转换成大写为：" + str16.toUpperCase());

 字符串转换成大写为：MYAGE

    static String valueOf(int i)

 //方法功能    返回int参数的字符串表示形式（将数字转换成字符串）
 System.out.println("6数字对应的字符串为：" + String.valueOf(6));
 //注：这里输出的6是一个字符串，相当于 "6"

 数字6对应的字符串为：6

    char[] toCharArray()

 String str17 = "aabbcd";
 //方法功能    将此字符串转换成一个字符数组
 char[] array = str17.toCharArray();
 System.out.print("数组array的内容为：");
 for (char x : array
 ) {
     System.out.print(x + " ");
 }

 数组array的内容为：a a b b c d 

    String replace(CharSequence oldstr,CharSequence newstr)

 String str18 = "abcd  :  1417";
 //方法功能    返回一个新的字符串，它是通过用newstr替换此字符串中出现的所有oldstr得到的
 System.out.println(str18.replace(" ", ""));

 替换后的字符串为：abcd:1417

    String[] split(String regex)

 String str19 = "2021:4:23";
 //方法功能    根据参数regex将字符串分割成若干个子字符串（regex是一个正则表达式，用来限定分割规则）
 String[] strArray = str19.split(":");
 System.out.print("strArray数组内容为：");
 for (String s : strArray
 ) {
     System.out.print(s + " ");
 }

 strArray数组内容为：2021 4 23 

    String substring(int beginIndex)

 String str20 = "ahijksasd";
 //方法功能    返回一个新字符串，它包含从指定的beginIndex起始角标处开始，直到此字符串末尾的所有字符
 System.out.println("从角标3开始的新字符串：" + str20.substring(3));

 从角标3开始的新字符串：jksasd

    String substring(int beginIndex,int endIndex)

 String str21 = "efghijklmn";
 //方法功能    返回一个新字符串，它包含从指定的beginIndex起始角标处开始，直到索引endIndex-1角标处的所有字符
 System.out.println("从角标3开始到角标8的新字符串：" + str21.substring(3, 8));

 从角标3开始到角标8的新字符串：hijkl

    String trim()

 String str22 = "   How are you?   ";
 //方法功能    返回一个新字符串，它去除了原字符串首尾的空字符（只能去除首尾空字符）
 System.out.println("去除字符串两端的空字符后：" + str22.trim());

 去除字符串两端的空字符后：How are you?

