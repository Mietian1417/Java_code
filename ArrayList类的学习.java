import java.time.*;
import java.util.*;

//public class CompanyTest {
//    public static void main(String[] args) {
//        Manager boss = new Manager("张青", 60000, 2020, 9, 28);
//        boss.setBonus(50000);
//        Employee[] staff = new Employee[4];
//        staff[0] = boss;
//        staff[1] = new Employee("夏琳", 20000, 2021, 3, 10);
//        staff[2] = new Employee("周飒", 26000, 2021, 3, 30);
//        staff[3] = new Employee("李静", 30000, 2021, 4, 20);
//        for (Employee e : staff) {
//            System.out.println("name=" + e.getName() + ",saraly=" + e.getSalary() +
//                    ",hireday=" + e.hireDay);
//        }
//    }
//}


public class CompanyTest {
    public static void main(String[] args) {
        ArrayList<Employee> e = new ArrayList<>();
        ArrayList<Manager> m = new ArrayList<>();
        e.add(new Manager("陈铭", 70000, 2019, 3, 5));
        e.add(new Employee("张烈", 25000, 2020, 2, 21));
        e.add(new Employee("李夏", 26000, 2021, 1, 15));
        e.add(new Employee("李霞", 27000, 2021, 2, 26));
        e.add(new Employee("丁劫", 28000, 2021, 3, 25));
        for (Employee x : e) {
            System.out.println(x);
        }
    }
}


class Employee {
    private final String name;
    private final int salary;
    LocalDate hireDay = LocalDate.now();

    public Employee(String name, int salary, int year, int month, int day) {
        this.name = name;
        this.salary = salary;
        hireDay = LocalDate.of(year, month, day);
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
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

class Manager extends Employee {
    private int bonus;

    public Manager(String name, int saraly, int year, int month, int day) {
        super(name, saraly, year, month, day);
        bonus = 0;
    }

    public int getSalary() {
        return super.getSalary() + bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }
}