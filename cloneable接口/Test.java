package cloneable接口;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 陈子豪
 * Date: 2021-05-24
 * Time: 19:06
 */
public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Car car = new Car("大巴");
        Person person = new Person("张希", 42, car);
        Person person1 = (Person) person.clone();
        System.out.println(person);
        System.out.println(person1);

        /*拷贝的时候只能拷贝一份表面的值，
            对于引用类型来说，虽然引用变量变了，但该引用类型的变量的指向却没有改变*/
        person1.c.car = "货车";
        System.out.println(person);
        System.out.println(person1);
    }
}
