//关于LocalDate类的学习
import java.util.*;
import java.time.*;

public class test{
    public static void main(String[] args) {
        Employee[] staff=new Employee[3];
        staff[0] =new Employee("张武",8500,2020,3,5);
        staff[1] =new Employee("李彩",9500,2019,5,9);
        staff[2] =new Employee("陈铭",12000,2021,9,27);
        System.out.println(Arrays.toString(staff));
    }
}

class Employee{
    private final String name;
    private final int salary;
    private final LocalDate hireDay;
    public Employee(String name,int salary,int year,int month,int day){
        this.name=name;
        this.salary=salary;
        hireDay=LocalDate.of(year,month,day);
    }
    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public LocalDate getHireDay() {
        return hireDay;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", hireDay=" + hireDay +
                '}';
    }
}