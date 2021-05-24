package comparator接口;

import java.util.Comparator;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 陈子豪
 * Date: 2021-05-24
 * Time: 18:30
 */
public class NameComparator implements Comparator<Person> {
    @Override
    public int compare(Person person1, Person person2) {
        return person1.name.compareTo(person2.name);
    }
}
