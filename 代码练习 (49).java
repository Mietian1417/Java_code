package 日常练习.猫狗收容所;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 陈子豪
 * Date: 2021-06-15
 * Time: 18:49
 */

//描述
//
//给定一个栈及一个操作序列int[][2] ope(C++中为vector<vector<int>>)，
// 代表所进行的入栈出栈操作。第一个元素为1则入栈，第二个元素为数的正负号；
// 第一个元素为2则出栈，第二个元素若为0则出最先入栈的那个数，
// 为1则出最先入栈的正数， 为-1则出最先入栈的负数。
// 请按顺序返回出栈的序列，并做异常处理忽略错误操作。
//测试样例：
//
//[[1,1],[1,-1],[2,0],[2,-1]]
//
//返回：[1,-1]


public class CatDogAsylum {
    public ArrayList<Integer> asylum(int[][] ope) {
        // write code here
        ArrayList<Integer> r = new ArrayList<Integer>();// 存放最终收养序列
        ArrayList<Integer> animal = new ArrayList<Integer>();// 存放进入收容所的动物
        int temp = 0;
        for (int i = 0; i < ope.length; i++) {
            switch (ope[i][0]) {
                // 有动物进入收容所
                case 1:
                    animal.add(ope[i][1]);
                    break;
                // 有人收养动物
                case 2:
                    // 第一种收养方式
                    if (!animal.isEmpty() && ope[i][1] == 0) {
                        r.add(animal.get(0));
                        animal.remove(0);
                    }
                    // 收养狗
                    else if (ope[i][1] == 1) {
                        for (temp = 0; temp < animal.size(); temp++) {
                            if (animal.get(temp) > 0) {
                                r.add(animal.get(temp));
                                animal.remove(temp);
                                break;
                            }
                        }
                    }
                    // 收养猫
                    else if (ope[i][1] == -1) {
                        for (temp = 0; temp < animal.size(); temp++) {
                            if (animal.get(temp) < 0) {
                                r.add(animal.get(temp));
                                animal.remove(temp);
                                break;
                            }
                        }
                    }
                    break;
            }
        }
        return r;
    }
}


/*
//失败篇 ，感觉很对。
public class CatDogAsylum {
    public ArrayList<Integer> asylum(int[][] ope) {
        // write code here
        Stack<Integer> pushStack = new Stack<>();
        ArrayList<Integer> arrayList = new ArrayList<>();
        Stack<Integer> flipStack = new Stack<>();
        Stack<Integer> positiveNumberStack = new Stack<>();
        Stack<Integer> negativeStack = new Stack<>();

        for (int i = 0; i < ope.length; i++) {

            if (ope[i][0] == 1) {
                pushStack.push(ope[i][1]);
            } else if (ope[i][0] == 2) {

                while (pushStack.size() != 0) {
                    flipStack.push(pushStack.pop());
                }


                if (ope[i][1] == 0) {

                    arrayList.add(flipStack.pop());
                } else if (ope[i][1] == 1 && !flipStack.empty()) {

                    while (flipStack.peek() <= 0 && !flipStack.empty()) {
                        negativeStack.push(flipStack.pop());
                    }

                    arrayList.add(flipStack.pop());

                    while (!negativeStack.empty()) {
                        flipStack.push(negativeStack.pop());
                    }
                } else if (ope[i][1] == -1) {

                    while (flipStack.peek() >= 0 && !flipStack.empty()) {
                        positiveNumberStack.push(flipStack.pop());
                    }

                    arrayList.add(flipStack.pop());

                    while (!positiveNumberStack.empty()) {
                        flipStack.push(positiveNumberStack.pop());
                    }
                }
            }
        }
        return arrayList;
    }
}
*/


