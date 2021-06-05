package Collection.List接口.ArrayList;

import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 陈子豪
 * Date: 2021-06-05
 * Time: 14:52
 */

// 使用 linkedList 类存储学生信息，并对其排序
class Student implements Comparable<Student> {
    private String name;
    private String className;
    private double grade;

    public Student(String name, String className, double grade) {
        this.name = name;
        this.className = className;
        this.grade = grade;
    }

    public void setAll(String name, String className, double grade) {
        this.name = name;
        this.className = className;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", className='" + className + '\'' +
                ", grade=" + grade +
                '}';
    }


    @Override
    public int compareTo(Student student) {
        return (int) (this.grade - student.grade);
    }
}

public class ArrayListTest1 {
    public static void main(String[] args) {
        Student[] students = new Student[]{
                new Student("张三", "100期1班", 92),
                new Student("李四", "100期1班", 89),
                new Student("王五", "100期1班", 90),
        };

        List<Student> list = new LinkedList<>();
        list.add(students[0]);
        list.add(students[1]);
        list.add(students[2]);

        Iterator<Student> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        //list.sort(Student::compareTo);
        Collections.sort(list);

        Iterator<Student> iterator1 = list.iterator();
        while (iterator1.hasNext()) {
            System.out.print(iterator1.next() + " ");
        }

    }
}
