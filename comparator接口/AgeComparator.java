package comparator接口;

import java.util.Comparator;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 陈子豪
 * Date: 2021-05-24
 * Time: 18:29
 */
/*Comparator接口可以多种比较方法，只要定义一个新类并在该类中实现Comparator接口即可，
 *   但从这也能看出，它依赖于对象，因而调用方式也不一样*/
public class AgeComparator implements Comparator<Person> {

    @Override
    public int compare(Person person1, Person person2) {
        return person1.age-person2.age;
    }
}
