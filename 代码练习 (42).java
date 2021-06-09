package 日常练习.有效的括号;

import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 陈子豪
 * Date: 2021-06-09
 * Time: 19:08
 */

//给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串 s ，判断字符串是否有效。
//
//有效字符串需满足：
//
//左括号必须用相同类型的右括号闭合。
//左括号必须以正确的顺序闭合。
//
//来源：力扣（LeetCode）
//链接：https://leetcode-cn.com/problems/valid-parentheses
//著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。

class Solution {
    public boolean isValid(String s) {
        if (s == null || s.length() == 0) {
            return true;
        }
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                if (stack.empty()) {
                    return false;
                }
                char top = stack.peek();
                if (c== ')' && top == '(' || c == '}' && top == '{' || c == ']' && top == '[') {
                    stack.pop();
                }else{
                    return false;
                }
            }
        }

        return stack.empty();

    }
}

/* 摸索版
class Solution {
    public boolean isValid(String s) {
        Stack<String> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{'){
                stack.push(s.charAt(i)+"");
                continue;
            }

            if(s.charAt(i) == ')') {
                if(stack.empty()){
                    return false;
                }

                if(!stack.peek().equals("(")){
                    return false;
                }
                stack.pop();
                continue;

            }

            if(s.charAt(i) == ']') {
                if(stack.empty()){
                    return false;
                }

                if(!stack.peek().equals("[")){
                    return false;
                }
                stack.pop();
                continue;

            }
            if(s.charAt(i) == '}') {
                if(stack.empty()){
                    return false;
                }

                if(!stack.peek().equals("{")){
                    return false;
                }
                stack.pop();


            }
        }

        return stack.empty();

    }
}
*/
