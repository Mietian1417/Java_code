package 对象的三大特性.封装;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 陈子豪
 * Date: 2021-05-26
 * Time: 15:30
 */

/*
public class Test {
    public static void main(String[] args) {
        Person person = new Person("张三",18);
        System.out.println("我叫" + person.name + ", 今年" + person.age + "岁");
    }
}*/


/*
class Test {
    public static void main(String[] args) {
        Person person = new Person("张三", 18);
        person.show();
    }
}*/


/*
class Test {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("张三");
        person.setAge(18);
        System.out.println("我叫" + person.getName() +
                "，今年" + person.getAge() + "岁。");
    }
}*/


class Test {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("张三");
        person.setAge(-18);
        System.out.println("我叫" + person.getName() +
                "，今年" + person.getAge() + "岁。");
    }
}