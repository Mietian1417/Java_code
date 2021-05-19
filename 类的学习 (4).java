class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println(this.name + "吃饭了！");
    }
}

class Bird extends Animal {
    public Bird(String name) {
        super(name);
    }

    public void fly() {
        System.out.println(this.name + "飞起来了！");
    }
}

class Cat extends Animal {
    String color;

    public Cat(String name, String color) {
        super(name);
        this.color = color;
    }

    public void eat() {
        System.out.println(this.color + "的" + this.name + "吃饭了！");
    }

    public void run() {
        System.out.println(this.color + "的" + this.name + "跑起来了！");
    }
}

public class Test {
    public static void main(String[] args) {
        Animal animal = new Animal("小动物");
        animal.eat();
        System.out.println();

        Bird bird = new Bird("小欧");
        bird.eat();
        bird.fly();
        System.out.println();

        Cat cat = new Cat("花花", "黑白色");
        cat.eat();
        cat.run();
        System.out.println();

        Animal animal1 = new Bird("小鹰");
        //发生了动态绑定，找到本质类型的重写方法
        animal1.eat();
        //animal1.fly; 向上转型后只能用父类本身的成员和方法，
        // 若想用子类的成员和方法，要向下转型！
        Bird bird1 = (Bird) animal1;
        bird1.fly();
        System.out.println();

        Animal animal2 = new Cat("小猫", "白色");
        //发生了动态绑定，找到本质类型的重写方法
        animal2.eat();
        //System.out.println(animal2.color);
        //animal2.run;
        //向下转型才能用子类的成员和方法
        Cat cat1 = (Cat) animal2;
        System.out.println(cat1.color);
        cat1.run();
        System.out.println();

        //注意：向下转型非常危险，因为他可以不从父类转型到子类
        Animal animal3 = new Bird("小鸟");
        //这里可以通过编译，但无法运行，这是十分危险的，
        //因而我们要用instanceof关键字来判断本质类型
        //Cat cat2=(Cat) animal3;
        //cat2.run();
        if (animal3 instanceof Cat) {
            Cat cat2 = (Cat) animal3;
            cat2.run();
        }

        if (animal3 instanceof Bird) {
            Bird bird2 = (Bird) animal3;
            bird2.fly();
        }
    }
}
