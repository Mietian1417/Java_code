package 对象的三大特性.继承;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 陈子豪
 * Date: 2021-05-26
 * Time: 15:53
 */
public class Cat extends Animal {
    private String color;

    public Cat(String name, String color) {
        super(name);
        this.color = color;
    }

    @Override
    public void eat() {
        System.out.println(this.color + "的" + this.name + "正在吃饭！");
    }

    public void running() {
        System.out.println(this.color + "的" + this.name + "跑起来了！");
    }

    public String getColor() {
        return color;
    }
}
