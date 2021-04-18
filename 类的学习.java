//类的学习
import java.util.*;
class Person{
    public String name;
    public int age;
    public String sex;
    public void eat(){
        System.out.println(name+" eat");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }
}
public class test {
    public static void main(String[] args) {
        Person p=new Person();
        p.name="zhangsan";
        p.age=22;
        p.sex="男";
        p.eat();
        System.out.println(p);
       // System.out.println(new Person().name="lisi");
    }
}