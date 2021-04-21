//封装
/*
import java.util.*;


class Person{
    private String name;
    private int age;
    private String sex;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
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

public class test{
    public static void main(String[] args){
        Person p1=new Person();
        p1.setName("zhangsan");
        p1.setAge(18);
        p1.setSex("男");
        System.out.println(p1);
    }
}
*/

//静态成员变量的用法
/*
import java.util.*;

class Person{
    public static String name;
    public static int age;
    public String sex;
    public static int count;
}

public class test{
    public static void main(String[] args) {
        //访问静态成员变量
        System.out.println(Person.name);
        System.out.println(Person.age);
        //Person p1=new Person();
        //Person p2=new Person();
        Person.count++;
        //System.out.println(p1.sex);
        //静态成员变量与对象无关，被每一个成员所共享
        System.out.println(Person.count);
        Person.count++;
        System.out.println(Person.count);
    }
}
*/

//静态代码块的学习
/*import java.util.*;

class Person {
//    static{
//        count=100;
//    }
    public String name;
    public static int count = 10;
    //静态代码块
    static{
        count=100;
    }
}

public class test {
    public static void main(String[] args) {
        Person p1=new Person();
        //静态代码块与静态成员变量的定义顺序影响变量的值
        System.out.println(Person.count);
    }
}*/

//构造方法的学习
/*
import java.util.*;

class Person{
    public String name;
    public int age;
    public String sex;
    //构造方法重载
    public Person(String name){
        this.name=name;
    }
    public Person(int age){
        //this在构造方法里调用构造方法
        this("wangwu");
        this.age=age;
    }
    public Person(String name,String sex){
        this.name=name;
        this.sex=sex;
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
public class test{
    public static void main(String[] args) {
        Person p1=new Person(18);
        System.out.println(p1);
        Person p2=new Person("zhangsan","男");
        System.out.println(p2);
        Person p3=new Person("lisi");
        System.out.println(p3);
    }
}
*/