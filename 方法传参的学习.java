//关于java的方法只能传值，不能传址的见解
//java只能改变通过改变地址里的内容来改变变量
import java.util.*;

class FunctionMethod{
    //改变的是s1,s2的内容
    public void swap1(Student s1,Student s2){
        Student temp=s1;
        s1=s2;
        s2=temp;
        System.out.println("swap1方法交换后："+s1.name+","+s2.name);
    }
    //改变的是array数组的内容
    public void swap2(Student s1,Student s2){
        String[] array=new String[2];
        array[0]= s1.name;
        array[1]=s2.name;
        String temp=array[0];
        array[0]=array[1];
        array[1]=temp;
        System.out.println("swap2方法交换后："+s1.name+","+s2.name);
    }
    //改变地址的内容
    public void swap3(Student s1,Student s2){
        s1.name="张希";
        s2.name="李馨";
        System.out.println("swap3方法交换后："+s1.name+","+s2.name);
    }
}

class Student{
    String name;
    String sex;
    int age;
    public Student(String name,String sex,int age){
        this.name=name;
        this.sex=sex;
        this.age=age;
    }
}

public class test {
    public static void main(String[] args) {
        FunctionMethod f=new FunctionMethod();
        Student p1=new Student("李馨","女",18);
        Student p2=new Student("张希","男",19);
        System.out.println("交换前："+p1.name+","+p2.name);
        //f.swap1(p1,p2);
        System.out.println("交换后："+p1.name+","+p2.name);
        System.out.println("----------------------------------");
        
        System.out.println("交换前："+p1.name+","+p2.name);
        //f.swap2(p1,p2);
        System.out.println("交换后："+p1.name+","+p2.name);
        System.out.println("----------------------------------");
        
        System.out.println("交换前："+p1.name+","+p2.name);
        f.swap3(p1,p2);
        System.out.println("交换后："+p1.name+","+p2.name);
    }
}