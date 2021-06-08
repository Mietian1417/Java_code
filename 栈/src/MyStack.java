

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 陈子豪
 * Date: 2021-06-07
 * Time: 20:30
 */
public class MyStack<T> {
    private T[] elem;
    private int top;

    public MyStack() {
        this.elem = (T[])new Object[10];
        this.top = -1;
    }

    //入栈
    public T push(T item) {
        if (this.top == this.elem.length) {
            this.elem = Arrays.copyOf(this.elem, 2 * this.elem.length);
        }

        return this.elem[++this.top] = item;
    }

    //出栈
    public T pop() {
        if (this.top == -1) {
            throw new UnsupportedOperationException("栈为空！");
        }

        return this.elem[this.top--];
    }

    //查看栈顶元素
    public T peek() {
        if (empty()) {
            throw new UnsupportedOperationException("栈为空！");
        }

        return this.elem[this.top];
    }

    //查看栈是否为空
    public boolean empty() {
        return this.top == -1;
    }

    //查找指定数据
    public int search(T key) {
        if (empty()) {
            throw new UnsupportedOperationException("栈为空！");
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
