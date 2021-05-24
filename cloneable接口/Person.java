package cloneable接口;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 陈子豪
 * Date: 2021-05-24
 * Time: 19:06
 */
public class Person implements Cloneable{
    String name;
    int age;
    Car c;

    public Person(String name,int age,Car car){
        this.name=name;
        this.age=age;
        this.c=car;
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", car=" + c +
                '}';
    }

    //浅拷贝
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

//   @Override
//   public Object clone() throws CloneNotSupportedException {
//       Person p =(Person)super.clone();
//       p.c=(Car)this.c.clone();
//       return p;
//   }

}
