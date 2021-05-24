package cloneable接口;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 陈子豪
 * Date: 2021-05-24
 * Time: 19:09
 */
public class Car implements Cloneable{
    String car;
    public Car(String car){
        this.car=car;
    }

    @Override
    public String toString() {
        return "Car{" +
                "car='" + car + '\'' +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
