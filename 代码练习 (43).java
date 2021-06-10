package 日常练习.用队列实现栈;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 陈子豪
 * Date: 2021-06-09
 * Time: 20:20
 */

//请你仅使用两个队列实现一个后入先出（LIFO）的栈，并支持普通队列的全部四种操作（push、top、pop 和 empty）。
//
//实现 MyStack 类：
//
//void push(int x) 将元素 x 压入栈顶。
//int pop() 移除并返回栈顶元素。
//int top() 返回栈顶元素。
//boolean empty() 如果栈是空的，返回 true ；否则，返回 false 。
// 
//
//注意：
//
//你只能使用队列的基本操作 —— 也就是 push to back、peek/pop from front、size 和 is empty 这些操作。
//你所使用的语言也许不支持队列。 你可以使用 list （列表）或者 deque（双端队列）来模拟一个队列 , 只要是标准的队列操作即可。
// 
//
//来源：力扣（LeetCode）
//链接：https://leetcode-cn.com/problems/implement-stack-using-queues
//著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
class MyStack {

    private Queue<Integer> queue1;
    private Queue<Integer> queue2;

    /**
     * Initialize your data structure here.
     */
    public MyStack() {
        this.queue1 = new LinkedList<>();
        this.queue2 = new LinkedList<>();
    }

    /**
     * Push element x onto stack.
     */
    public void push(int x) {
        if (this.queue1.isEmpty() && this.queue2.isEmpty()) {
            this.queue1.offer(x);
        } else {
            if (!this.queue1.isEmpty()) {
                this.queue1.offer(x);
                return;
            }
            this.queue2.offer(x);
        }
    }

    /**
     * Removes the element on top of the stack and returns that element.
     */
    public int pop() {
        int ret = 0;
        if (this.queue1.isEmpty()) {
            int length = this.queue2.size();
            for (int i = 0; i < length; i++) {
                if (i == length - 1) {
                    ret = this.queue2.remove();
                } else {
                    this.queue1.offer(this.queue2.remove());
                }
            }
        } else {
            int length = this.queue1.size();
            for (int i = 0; i < length; i++) {
                if (i == length - 1) {
                    ret = this.queue1.remove();
                } else {
                    this.queue2.offer(this.queue1.remove());
                }
            }
        }
        return ret;
    }

    /**
     * Get the top element.
     */
    public int top() {
        int ret = 0;
        if (this.queue1.isEmpty()) {
            int length = this.queue2.size();
            for (int i = 0; i < length; i++) {
                if (i == length - 1) {
                    ret = this.queue2.element();
                }

                this.queue1.offer(this.queue2.remove());

            }
        } else {
            int length = this.queue1.size();
            for (int i = 0; i < length; i++) {
                if (i == length - 1) {
                    ret = this.queue1.element();
                }

                this.queue2.offer(this.queue1.remove());

            }
        }
        return ret;
    }

    /**
     * Returns whether the stack is empty.
     */
    public boolean empty() {
        return this.queue1.isEmpty() && this.queue2.isEmpty();
    }

    public void diaPlay() {
        if (this.queue2.isEmpty()) {
            System.out.println(this.queue1);
        } else {
            System.out.println(this.queue2);
        }
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */