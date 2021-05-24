package comparator接口;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 陈子豪
 * Date: 2021-05-24
 * Time: 18:36
 */
public class Test {
    public static void main(String[] args) {
        Person person1=new Person("张三",35);
        Person person2=new Person("李四",24);
        Person person3=new Person("席卡希",23);
        Person person4=new Person("李达",25);
        AgeComparator ageComparator=new AgeComparator();
        System.out.println(ageComparator.compare(person1, person2));
        System.out.println(ageComparator.compare(person3, person4));

        System.out.println("-------------------------");

        Person[] people=new Person[5];
        people[0]=new Person("李龙",25);
        people[1]=new Person("晓晓",37);
        people[2]=new Person("张希",20);
        people[3]=new Person("吴霞",39);
        people[4]=new Person("夏彩",35);
        System.out.println(Arrays.toString(people));
        System.out.println("--------按年龄----------");
        AgeComparator ageComparator1=new AgeComparator();
        Arrays.sort(people,ageComparator1);
        System.out.println(Arrays.toString(people));

        System.out.println(Arrays.toString(people));
        System.out.println("--------按姓名----------");
        NameComparator nameComparator=new NameComparator();
        Arrays.sort(people,nameComparator);
        System.out.println(Arrays.toString(people));
    }
}
