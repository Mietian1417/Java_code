package 对象的三大特性.继承;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 陈子豪
 * Date: 2021-05-26
 * Time: 15:53
 */
public class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    protected void eat() {
        System.out.println(this.name + "正在吃饭！");
    }

    public String getName() {
        return name;
    }
}
