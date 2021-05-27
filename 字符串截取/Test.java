package 字符串的常见操作.字符串截取;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 陈子豪
 * Date: 2021-05-27
 * Time: 18:19
 */
public class Test {
    public static void main(String[] args) {
        //public String substring(int beginIndex)
        //从指定索引截取到结尾
        String str="hello world";
        System.out.println(str.substring(5));
        System.out.println(str.substring(3));

        //public String substring(int beginIndex, int endIndex)
        //截取部分内容
        System.out.println(str.substring(5,8));
        System.out.println(str.substring(3,8));

    }
}
