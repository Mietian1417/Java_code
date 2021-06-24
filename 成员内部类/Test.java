package 成员内部类;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 陈子豪
 * Date: 2021-06-24
 * Time: 20:35
 */
/*
 *	其他类使用成员内部类
 */
public class Test {

    public static void main(String[] args) {
        //外部类对象
        Outer outer = new Outer();
        //创造内部类对象
        Outer.Inner inner = outer.new Inner();
        inner.innerShow();
        /*
         * 可在Outer中定义get方法，获得Inner对象,那么使用时，只需outer.getInnerInstance()即可。
         * public Inner getInnerInstance(Inner类的构造方法参数){
         *   return new Inner(参数);
         * }
         */
    }
}
