package StringBuffer类;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 陈子豪
 * Date: 2021-05-29
 * Time: 18:55
 */
public class Test {
    public static void main(String[] args) {
        //public StringBuffer append(String str)
        //将指定的字符串追加到此字符序列
        StringBuffer sb=new StringBuffer("hello");
        sb.append(" world!");
        sb.append("你好，世界！");
        System.out.println(sb.toString());

        //public StringBuffer reverse()
        //将此字符序列用其翻转形式取代
        sb.reverse();
        System.out.println(sb.toString());

        //public StringBuffer insert (int dstOffset CharSequence s)
        //将s插入到字符序列偏移量为dstOffset的位置
        StringBuffer sb1= new StringBuffer("abc");
        sb1.insert(2,"lk");
        System.out.println(sb1.toString());

        //public StringBuffer replace(int start, int end, String str)
        //使用给定的str替代此字符序列的子字符串
        StringBuffer sb2=new StringBuffer("abcdef");
        sb2.replace(1,10,"55");
        System.out.println(sb2.toString());
        StringBuffer sb3=new StringBuffer("abcdef");
        sb3.replace(1,3,"5555555");
        System.out.println(sb3.toString());
        StringBuffer sb4=new StringBuffer("abcdef");
        sb4.replace(1,4,"55");
        System.out.println(sb4.toString());

        //public StringBuffer delete(int start, int end)
        //删除指定范围内的数据
        StringBuffer sb5=new StringBuffer("abcdefghi");
        sb5.delete(0,5);
        System.out.println(sb5.toString());
    }
}
