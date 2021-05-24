package comparable接口;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 陈子豪
 * Date: 2021-05-24
 * Time: 18:26
 */
public class Test {
    public static void main(String[] args) {
        Person person1= new Person("张三",21);
        Person person2= new Person("李四",25);
        Person person3= new Person("西夏",26);
        Person person4= new Person("东海",27);
        Person person5= new Person("卢西",29);
        System.out.println(person1.compareTo(person2));
        System.out.println(person2.compareTo(person4));
        System.out.println(person3.compareTo(person2));
        System.out.println(person5.compareTo(person2));

        System.out.println("----------------------");

        Person[] people=new Person[5];
        people[0]=new Person("席卡",55);
        people[1]=new Person("席卡",24);
        people[2]=new Person("席卡",29);
        people[3]=new Person("席卡",27);
        people[4]=new Person("席卡",45);
        System.out.println(Arrays.toString(people));
        Arrays.sort(people);
        System.out.println(Arrays.toString(people));
    }
}


