package 静态内部类;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 陈子豪
 * Date: 2021-06-24
 * Time: 20:36
 */


/**
 * 外部类、内部类定义
 */
public class Outer {

    private int outerVariable = 1;

    /**
     * 外部类定义的属性(重名)
     */
    private int commonVariable = 2;

    private static int outerStaticVariable = 3;

    static {
        System.out.println("Outer的静态块被执行了……");
    }

    /**
     * 成员方法
     */
    public void outerMothod() {
        System.out.println("我是外部类的outerMethod方法");
    }

    /*
     *	静态方法
     */
    public static void outerStaticMethod() {
        System.out.println("我是外部类的outerStaticMethod静态方法");
    }


    /**
     * 静态内部类
     */
    public static class Inner {
        /**
         * 成员信息
         */
        private int innerVariable = 10;
        private int commonVariable = 20;

        static {
            System.out.println("AnonymousTest.Inner的静态块执行了……");
        }

        private static int innerStaticVariable = 30;

        /**
         * 成员方法
         */
        public void innerShow() {
            System.out.println("innerVariable:" + innerVariable);
            System.out.println("内部的commonVariable:" + commonVariable);
            System.out.println("outerStaticVariable:" + outerStaticVariable);
            outerStaticMethod();
        }

        /**
         * 静态方法
         */
        public static void innerStaticShow() {
            //被调用时会先加载Outer类
            outerStaticMethod();
            System.out.println("outerStaticVariable" + outerStaticVariable);
        }
    }

    /**
     * 外部类的内部如何和内部类打交道
     */
    public static void callInner() {
        System.out.println(Inner.innerStaticVariable);
        Inner.innerStaticShow();
    }
}

//规范：

//内部可以包含任意的信息。
//静态内部类的方法只能访问外部类的static关联的信息。
//利用 外部类.内部类 引用=new 外部类.内部类(); 然后利用引用.成员信息(属性、方法)调用。
//访问内部类的静态信息，直接外部类.内部类.静态信息就可以了。
//静态内部类可以独立存在，不依赖于其他外围类。
