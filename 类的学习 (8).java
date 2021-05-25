
/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 陈子豪
 * Date: 2021-05-24
 * Time: 20:12
 */
public class Test {
    public static void main(String[] args) {
        String str1="hello";
        String str2=new String("hello");
        System.out.println(str1==str2);  //false

        String str3="he"+"llo"; //在编译时就可以确定右边为"hello"
        System.out.println(str1==str3);  //true

        String str4 ="he";
        String str5="llo";
        String str6=str4+str5;  //对于变量在编译时并不知道，运行时会创建新对象
        System.out.println(str1==str6);   //false

        String str7="he"+new String("llo"); //与上道理相同
        System.out.println(str1==str7);   //false

        //但直接用String=” “的形式来创建（直接赋值），该字符串会入常量池
        // 当创建的内容已存在时，不会再浪费空间去创建内容，
        // 而是让变量引用常量池已有的内容
        //==比较的是变量的地址，而equals比较的是变量内容

        String s1="Hello";
        s1=s1+" World";
        s1+="!!!";
        System.out.println(s1);
        //在该过程中共产生了五个对象，其中三个在常量池（直接以""的形式），两个在堆，
        //但最后只有最后一个存在，其他的都被回收了
        //由此可以看出这种做法效率极低，
        // 因而我们应该尽量少用这种能产生大量临时变量的方法



        //也可以手动入常量池，如果字符串在常量池已存在，则不再入常量池，
        //字符串不存在常量池就入常量池
        String s2="hi";
        String s3=new String("hi").intern(); //入常量池

        
    }
}
