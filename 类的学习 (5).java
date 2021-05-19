package 多态;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 陈子豪
 * Date: 2021-05-19
 * Time: 19:58
 */

class Shape {
    public void draw() {

    }
}

class Rectangle extends Shape {
    public void draw() {
        System.out.println("这是一个矩形！");
    }
}

class Circle extends Shape {
    public void draw() {
        System.out.println("这是一个圆形！");
    }
}

class Triangle extends Shape {
    public void draw() {
        System.out.println("这是这个三角形！");
    }
}

class Square extends Shape {
    public void draw() {
        System.out.println("这是一个正方形！");
    }
}

public class Test {
    public static void drawMap(Shape shape) {
        shape.draw();
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        Circle circle = new Circle();
        Triangle triangle = new Triangle();
        Square square = new Square();
        //多态的体现，对于一个方法有着不同的操作
        drawMap(rectangle);
        drawMap(circle);
        drawMap(triangle);
        drawMap(square);
        System.out.println("------------------------");
        /*多态的好处：1.类的调用者对类的使用成本降低。
         *               类的调用者只要知道对象是哪个就行，不必知道类的具体实现过程
         *           2.降低了“圈复杂度”，避免使用大量的if-else语句
         *           3.可拓展性强
         *               调用者只要创建新类的实例对象即可，例如添加应该正方形类 */

        //如果没有多态，就要如下调用方法
        Shape[] shapes = {rectangle, circle, triangle, circle, rectangle};
        for (Shape shape : shapes) {
            if (shape.equals(rectangle)) {
                shape.draw();
            } else if (shape.equals(circle)) {
                shape.draw();
            } else {
                shape.draw();
            }
        }
        System.out.println("------------------");

        //利用多态
        for (Shape shape : shapes) {
            shape.draw();
        }
    }
}
