package 日常练习.逆波兰表达式求值;

import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 陈子豪
 * Date: 2021-06-10
 * Time: 19:14
 */

//根据 逆波兰表示法，求表达式的值。
//
//有效的算符包括 +、-、*、/ 。每个运算对象可以是整数，也可以是另一个逆波兰表达式。
//
//
//
//说明：
//
//    整数除法只保留整数部分。
//    给定逆波兰表达式总是有效的。换句话说，表达式总会得出有效数值且不存在除数为 0 的情况。
//
//来源：力扣（LeetCode）
//链接：https://leetcode-cn.com/problems/evaluate-reverse-polish-notation
//著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。

class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < tokens.length; i++) {
            if (!tokens[i].equals("+") && !tokens[i].equals("-") &&
                    !tokens[i].equals("*") && !tokens[i].equals("/")) {
                stack.push(Integer.parseInt(tokens[i]));
            } else {
                int rightOperands = stack.pop();
                int leftOperands = stack.pop();

                switch (tokens[i]) {
                    case "+":
                        stack.push(leftOperands + rightOperands);
                        break;
                    case "-":
                        stack.push(leftOperands - rightOperands);
                        break;
                    case "*":
                        stack.push(leftOperands * rightOperands);
                        break;
                    case "/":
                        stack.push(leftOperands / rightOperands);
                        break;
                }
            }
        }
        return stack.pop();
    }
}