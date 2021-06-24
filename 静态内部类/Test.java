package 静态内部类;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 陈子豪
 * Date: 2021-06-24
 * Time: 20:36
 */

public class Test {

    public static void main(String[] args) {
        //访问静态内部类的静态方法，Inner类被加载,此时外部类未被加载，独立存在，不依赖于外围类。
        Outer.Inner.innerStaticShow();
        //访问静态内部类的成员方法
        Outer.Inner oi = new Outer.Inner();
        oi.innerShow();
    }
}

