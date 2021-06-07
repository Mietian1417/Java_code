package Iterable.Collection.List接口.Stack;

import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 陈子豪
 * Date: 2021-06-07
 * Time: 20:09
 */
public class MethodTest {
    public static void main(String[] args) {
        Stack<Integer> stack =new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        //1 2 3 4 5
        System.out.println(stack);

        int ret1 = stack.pop();
        System.out.println(ret1);

        int ret2 = stack.peek();
        System.out.println(ret2);

        //注意，栈的下标由 1 开始
        System.out.println(stack);
        int ret3 = stack.search(4);
        System.out.println(ret3);

        boolean ret4 = stack.empty();
        System.out.println(ret4);

        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        boolean ret5 = stack.empty();
        System.out.println(ret5);

    }
}
