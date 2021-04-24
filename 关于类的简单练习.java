//一个简单的计算器
/*
import java.util.*;

class Calculator {
    int num1;
    int num2;

    public Calculator(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int add() {
        return this.num1 + this.num2;
    }

    public int sub() {
        return this.num1 - this.num2;
    }

    public int div() {
        return this.num1 * this.num2;
    }

    public double mul() {
        return this.num1 * 1.0 / this.num2;
    }
}

public class test {
    public static void main(String[] args) {
        Calculator calculator = new Calculator(20, 60);
        System.out.println(calculator.add());
        System.out.println(calculator.sub());
        System.out.println(calculator.div());
        System.out.println(calculator.mul());
    }
}
*/

//用类交换数组的值

/*
import java.util.*;

class Value {
    public int val;
}

public class test {
    static void swap(Value val1, Value val2) {
        int temp = val1.val;
        val1.val = val2.val;
        val2.val = temp;
    }

    public static void main(String[] args) {
        Value val1 = new Value();
        val1.val = 10;
        Value val2 = new Value();
        val2.val = 20;
        System.out.println("交换前");
        System.out.println(val1.val);
        System.out.println(val2.val);
        swap(val1, val2);
        System.out.println("交换后");
        System.out.println(val1.val);
        System.out.println(val2.val);
    }
}
*/
