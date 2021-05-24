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

        //但直接用String=“ ”的形式来创建，当创建的内容已存在时，
        // 不会再浪费空间去创建内容，而是让变量引用已有的内容

        //==比较的是变量的地址，而equals比较的是变量内容

    }
}
