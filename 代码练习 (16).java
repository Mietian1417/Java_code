//KiKi理解了继承可以让代码重用，他现在定义一个基类shape，
//私有数据为坐标点x,y,  由它派生Rectangle类和Circle类，它们都有成员函数GetArea()求面积。
//派生类Rectangle类有数据：矩形的长和宽；派生类Circle类有数据：圆的半径。
//Rectangle类又派生正方形Square类，定义各类并测试。
//输入三组数据，分别是矩形的长和宽、圆的半径、正方形的边长，
//输出三组数据，分别是矩形、圆、正方形的面积。圆周率按3.14计算。

import java.util.*;

class shape {
    private int x;
    private int y;

    public shape() {

    }

    public shape(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}

class Rectangle extends shape {
    public int length;
    public int wide;

    public Rectangle() {

    }

    public int GetArea() {
        return this.length * this.wide;
    }

    public Rectangle(int length, int wide) {
        super(5, 6);
        this.length = length;
        this.wide = wide;
    }
}

class Circle extends shape {
    public double radius;

    public Circle() {

    }

    public double GetArea() {
        return 3.14 * Math.pow(this.radius, 2);
    }

    public Circle(double radius) {
        super(6, 7);
        this.radius = radius;
    }
}

class Square extends Rectangle {
    public Square(int sideLength) {
        super(sideLength, sideLength);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Rectangle rectangle = new Rectangle(reader.nextInt(), reader.nextInt());
        Circle circle = new Circle(reader.nextDouble());
        Square square = new Square(reader.nextInt());
        System.out.println(rectangle.GetArea());
        if(circle.GetArea()==(int)(circle.GetArea())){
            System.out.printf("%d\n",(int)circle.GetArea());
        }else{
            System.out.println(circle.GetArea());
        }
        System.out.println(square.GetArea());

    }
}










