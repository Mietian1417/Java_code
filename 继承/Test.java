package 对象的三大特性.继承;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 陈子豪
 * Date: 2021-05-26
 * Time: 15:34
 */
public class Test {
    public static void main(String[] args) {
        Animal animal = new Animal("小动物");
        Cat cat = new Cat("小猫", "白色");
        Duck duck = new Duck("小鸭");
        animal.eat();      //小动物正在吃饭！
        System.out.println(cat.getName() + "是" +
                cat.getColor() + "的。");   //小猫是白色的。
        cat.eat();         //白色的小猫正在吃饭！
        cat.running();     //白色的小猫跑起来了！
        duck.eat();        //小鸭正在吃饭！
        duck.swimming();   //小鸭正在游泳！
        duck.flying();     //小鸭正在游泳！
    }
}
