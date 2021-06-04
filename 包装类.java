package 包装类;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 陈子豪
 * Date: 2021-06-04
 * Time: 18:14
 */
public class Test {
    public static void main(String[] args) {
        Integer integer = 1;
        int i = integer;

        //自动装箱与拆箱

        //原理
        //Integer integer = new Integer(1);
        //int i = integer.intValue();

        int j = 1;
        Integer integer1 = j;

        //原理
        //int j = 1;
        //Integer integer1=Integer.valueOf(j);

        //关于Integer类中的 cache数组
        /*
        * Integer类有一个cache数组，里面存放着-128 -> 127这些数，
        * 一共256个数，下标从0-255，
        * 如果装箱的数在cache数组中存在，则直接引用，否则创建新对象 */
        
        //例：
        Integer a = 100;
        Integer b = 100;
        System.out.println(a == b);

        Integer c = 200;
        Integer d = 200;
        System.out.println(c == d);
    }
}
