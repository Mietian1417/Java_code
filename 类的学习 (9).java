import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 陈子豪
 * Date: 2021-05-24
 * Time: 21:11
 */
public class TestDemo {
    public static void main(String[] args) throws UnsupportedEncodingException {
        //字节，字符，字符串之间的转换

        //public String (char value[])
        //将字符数组中的所有内容变为字符串
        char[] chars={'h','e','l','l','o'};
        String str= new String(chars);
        System.out.println(str);

        //public String (char value[],int offset,int count)
        //将部分字符数组中的内容变为字符串
        String str2=new String(chars,1,3);
        System.out.println(str2);

        //public char charAt(int index)
        //取得指定索引位置的字符，索引从0开始
        String str3="hello";
        char c=str3.charAt(1);
        System.out.println(c);

        //public char[] toCharArray()
        //将字符串变为字符数组返回
        String str4="hello world";
        char[] chars1=str4.toCharArray();
        System.out.println(Arrays.toString(chars1));

        //public String(byte bytes[])
        //将字节数组变为字符串
        byte[] bytes={97,98,99};
        String str5=new String(bytes);
        System.out.println(str5);

        //public String (byte bytes[],int offset,int length)
        //将部分字节数组中的内容变为字符串
        char[] chars2={97,98,99,100,101,102};
        String str6=new String(chars2,1,5);
        System.out.println(str6);

        //public byte[] getBytes()
        //将字符串以字节数组的心形式返回
        String str7="Hello World";
        byte[] bytes1=str7.getBytes();
        System.out.println(Arrays.toString(bytes1));

        //public byte[] getBytes(String charsetName) throws UnsupportedEncodingException
        //编码转换处理
        String str8="好样的";
        byte[] bytes2=str8.getBytes("GBK");
        System.out.println(Arrays.toString(bytes2));
        byte[] bytes3=str8.getBytes("utf-8");
        System.out.println(Arrays.toString(bytes3));
    }
}
