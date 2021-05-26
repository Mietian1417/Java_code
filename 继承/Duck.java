package 对象的三大特性.继承;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 陈子豪
 * Date: 2021-05-26
 * Time: 15:53
 */
public class Duck extends Animal {
    public Duck(String name) {
        super(name);
    }

    public void swimming() {
        System.out.println(this.name + "正在游泳！");
    }

    public void flying() {
        System.out.println(this.name + "飞起来了！");
    }
}
