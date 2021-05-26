package 字符串的常见操作.字符串替换;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 陈子豪
 * Date: 2021-05-26
 * Time: 20:51
 */
public class Test {
    public static void main(String[] args) {
        //public String replaceAll(String regex, String replacement)
        //替换所有指定内容
        String str1="abdcabcdbcab";
        System.out.println(str1.replaceAll("ab", "AB"));
        System.out.println(str1.replaceAll("aaa", "AB"));  //没有就不替换

        //public String replaceFirst(String regex, String replacement)
        //替换首个内容
        System.out.println(str1.replaceFirst("ab","AB"));
    }

}
