import java.util.Arrays;
import java.util.Map;
import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 陈子豪
 * Date: 2021-06-07
 * Time: 20:30
 */
public class MyStack {
    private int[] elem;
    private int top;

    public MyStack() {
        this.elem = new int[10];
        this.top = -1;
    }

    //入栈
    public int push(int item) {
        if (top == this.elem.length - 1) {
            this.elem = Arrays.copyOf(this.elem, 2 * this.elem.length);
        }

        return this.elem[++this.top] = item;
    }

    //出栈
    public int pop() {
        if (this.top == -1) {
            System.out.println("栈为空，无法出栈！");
            return 0;
        }

        return this.elem[this.top--];
    }

    //查看栈顶元素
    public int peek() {
        if (this.top == -1) {
            System.out.println("栈为空！");
            return 0;
        }

        return this.elem[this.top];
    }

    //查看栈是否为空
    public boolean empty() {
        return this.top == -1;
    }

    //查找指定数据
    public int search(int key) {
        if (this.top == -1) {
            System.out.println("栈为空！");
            return 0;
        }

        for (int i = 0; i <= this.top; i++) {
            if (this.elem[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public void disPlay() {
        for (int i = 0; i <= this.top; i++) {
            System.out.print(this.elem[i] + " ");
        }
        System.out.println();
    }
}
