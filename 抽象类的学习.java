import java.time.LocalDate;

public class PersonTest {
    public static void main(String[] args) {
        Person[] per=new Person[4];
        per[0]=new Student("李希","computer");
        per[1]=new Student("夏琳","math");
        per[2]=new Employee("李霞",20000,2020,12,6);
        per[3]=new Employee("张侠",23000,2021,2,25);
        for (Person p:per) {
            System.out.println("name:"+p.getName()+" "+p.getDescription());
        }
    }
}

abstract class Person {
    public abstract String getDescription();

    private final String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}

class Student extends Person {
    private final String major;

    public Student(String name, String major) {
        super(name);
        this.major = major;
    }

    public String getDescription() {
        return "My majoring is " + major;
    }
}

class Employee extends Person {
    private final int salary;
    LocalDate hireDay = LocalDate.now();

    public Employee(String name, int saraly,int year, int month, int day) {
        super(name);
        this.salary = saraly;
        hireDay = LocalDate.of(year, month, day);
    }

    public String getDescription() {
        return "My salary is" + salary+", and my hire day is "+hireDay;
    }

}
