class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }
}

interface IRunning {
    void run();
}

interface ISwimming {
    void swim();
}

interface IFly {
    void fly();
}

class Cat extends Animal implements IRunning {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println(this.name + "跑起来了!");
    }
}

class Dog extends Animal implements IRunning, ISwimming {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println(this.name + "跑起来了！");
    }

    @Override
    public void swim() {
        System.out.println(this.name + "在游泳！");
    }
}

class Duck extends Animal implements IRunning, ISwimming, IFly {
    public Duck(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println(this.name + "跑起来了！");
    }

    @Override
    public void swim() {
        System.out.println(this.name + "在游泳！");
    }

    @Override
    public void fly() {
        System.out.println(this.name + "飞起来了！");
    }
}

class Robot implements IRunning{
    public void run(){
        System.out.println("机器人跑起来了！");
    }
}

public class testDemo {
    public static void running(IRunning iRunning) {
        iRunning.run();
    }

    public static void swimming(ISwimming iSwimming) {
        iSwimming.swim();
    }

    public static void flying(IFly iFly) {
        iFly.fly();
    }

    //接口调用时，并不关心对象类型，它只关心这个对象有没有实现这个接口
    public static void main(String[] args) {
        Cat cat=new Cat("小猫");
        Dog dog=new Dog("小狗");
        Duck duck=new Duck("小鸭子");
        running(cat);
        //swimming(cat); 对象的类没有实现对应接口，就无法调用
        running(dog);
        swimming(dog);
        running(duck);
        swimming(duck);
        flying(duck);

    }
}
