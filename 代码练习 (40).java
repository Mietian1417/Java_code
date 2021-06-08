package 日常练习.获取栈的最小元素;

import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 陈子豪
 * Date: 2021-06-08
 * Time: 20:47
 */
public class Solution {

}

class MinStack {

    private Stack<Integer> stack;
    private Stack<Integer> minStack;

    /** initialize your data structure here. */
    public MinStack() {
        this.stack = new Stack<>();
        this.minStack = new Stack<>();
    }

    public void push(int val) {
        this.stack.push(val);
        if(this.minStack.empty()){
            this.minStack.push(val);
        }else{
            int top = minStack.peek();
            if(val <= top){
                this.minStack.push(val);
            }
        }

    }

    public void pop() {
        int ret = this.stack.pop();
        if(ret == this.minStack.peek()){
            this.minStack.pop();
        }
    }

    public int top() {
        if(this.stack.empty()){
            return -1;
        }
        return this.stack.peek();
    }

    public int getMin() {
        if(this.minStack.empty()){
            return -1;
        }
        return this.minStack.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
