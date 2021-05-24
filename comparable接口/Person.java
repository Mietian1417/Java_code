package comparable接口;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 陈子豪
 * Date: 2021-05-24
 * Time: 18:25
 */

/*People类实现了Comparable接口，可以进行排序，
 *   但是该方法太局限了，只能用Person类中重写了的compareTo方法*/
public class Person implements Comparable<Person>{
    String name;
    int age;

    public Person(String name,int age){
        this.name=name;
        this.age=age;
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Person person) {
//        if(this.age<person.age){
//            return -1;
//        }else if(this.age>person.age){
//            return 1;
//        }else{
//            return 0;
//        }
        return Integer.compare(this.age, person.age);
    }
}
