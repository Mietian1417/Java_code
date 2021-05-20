interface IShape {
    void draw();

    //接口的默认方法用就直接调用，不需要重写
    default void fun() {
        System.out.println("===========================");
    }
}

interface Area extends IShape {
    void area();
}

interface Perimeter extends IShape {
    void perimeter();
}

class Rectangle implements Area, Perimeter {
    int length;
    int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public void draw() {
        System.out.println("这是一个矩形！");
    }

    @Override
    public void area() {
        System.out.println("它的面积是：" + this.length * this.width);
    }

    @Override
    public void perimeter() {
        System.out.println("它的周长是：" + 2 * (this.length + this.width));
    }
}

class Triangle implements Area, Perimeter {
    private final double a;
    private final double b;
    private final double c;
    private final double p;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.p = (this.a + this.b + this.c) / 2.0;
    }

    @Override
    public void draw() {
        System.out.println("这是一个三角形！");
    }

    @Override
    public void area() {
        if (this.a + this.b <= this.c || this.a + this.c <= this.b || this.b + this.c <= this.a) {
            System.out.println("该三条边无法构成三角形！");
            return;
        }
        System.out.println("它的面积是：" + Math.pow((this.p * (this.p - this.a) *
                (this.p - this.b) * (this.p - this.c)), 0.5));
    }

    @Override
    public void perimeter() {
        if (this.a + this.b <= this.c || this.a + this.c <= this.b || this.b + this.c <= this.a) {
            System.out.println("该三条边无法构成三角形！");
            return;
        }
        System.out.println("它的周长是：" + (this.a + this.b +
                this.c));
    }
}

class Circle implements Area, Perimeter {
    public static final double PI = 3.14;
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("这是一个圆形！");
    }

    @Override
    public void area() {

        System.out.println("它的面积是：" + PI * Math.pow(this.radius, 2));
    }

    @Override
    public void perimeter() {
        System.out.println("它的周长是：" + 2 * PI * this.radius);
    }
}

public class Test {
    public static void drawMapAndAreaAndPerimeter(IShape iShape) {
        iShape.draw();
        if (iShape instanceof Rectangle) {
            ((Rectangle) iShape).area();
            ((Rectangle) iShape).perimeter();
        }
        if (iShape instanceof Triangle) {
            ((Triangle) iShape).area();
            ((Triangle) iShape).perimeter();
        }
        if (iShape instanceof Circle) {
            ((Circle) iShape).area();
            ((Circle) iShape).perimeter();
        }
        iShape.fun();
    }

    public static void area() {
    }

    public static void main(String[] args) {
        //接口与抽象类语法一样,向上转型、动态绑定等等。
        Rectangle rectangle = new Rectangle(4, 5);
        Triangle triangle = new Triangle(3, 4, 5);
        Circle circle = new Circle(4);
        drawMapAndAreaAndPerimeter(rectangle);
        drawMapAndAreaAndPerimeter(triangle);
        drawMapAndAreaAndPerimeter(circle);
    }
}
