//一个员工类的简单使用
/*
import java.util.*;

class Employee{
    private String name;
    private final int id;
    private final int salary;
    public Employee(String name, int id, int salary){
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    public Employee(int id,int salary){
        this.id=id;
        this.salary=salary;
    }

    public Employee(String name){
        this(2021452,8500);
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getSalary() {
        return salary;
    }
}

public class test{
    public static void main(String[] args) {
        Employee[] staff =new Employee[3];
        staff[0]=new Employee("张三",2021144,8000);
        staff[1]=new Employee("李四",2021425,9000);
        staff[2]=new Employee("王五");
        for (Employee x:staff) {
            System.out.println("name="+x.getName()+",id="+x.getId()+",salary="+x.getSalary());
        }
    }
}
*/

//一个员工类的简单使用，使用了静态成员变量和方法来给员工赋工号
import java.util.*;

class Employee{
    private String name;
    private static int nextId=1;
    private int id;
    private final int salary;
    public Employee(String name, int id, int salary){
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    public Employee(int salary){
        this.salary=salary;
    }

    public Employee(String name,int salary){
        this.name=name;
        this.salary=salary;
    }

    public Employee(String name){
        this(8500);
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getSalary() {
        return salary;
    }

    public void setId(){
        this.id=Employee.nextId;
        Employee.nextId++;
    }

    public static int getNextId(){
        return nextId;
    }
}

public class test{
    public static void main(String[] args) {
        Employee[] staff =new Employee[3];
        staff[0]=new Employee("张三",8000);
        staff[1]=new Employee("李四",9000);
        staff[2]=new Employee("王五");
        for (Employee x:staff) {
            x.setId();
            System.out.println("name="+x.getName()+",id="+x.getId()+",salary="+x.getSalary());
        }
    }
}