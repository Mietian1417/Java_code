// 给定一个整数数组nums，按升序排序，数组中的元素各不相同。
// nums数组在传递给search函数之前，会在预先未知的某个下标 t（0 <= t <= nums.length-1）上进行旋转，
// 让数组变为[nums[t], nums[t+1], ..., nums[nums.length-1], nums[0], nums[1], ..., nums[t-1]]。
// 比如，数组[0,2,4,6,8,10]在下标2处旋转之后变为[6,8,10,0,2,4]
// 现在给定一个旋转后的数组nums和一个整数target，请你查找这个数组是不是存在这个target，
// 如果存在，那么返回它的下标，如果不存在，返回-1

/*
import java.util.*;

public class Solution {
    public int search(int[] nums, int target) {
        // write code here
        int left = 0, right = nums.length - 1;
        // 先找到left和right的索引，right的索引需要加上数组长度
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i + 1] < nums[i]) {
                left = i + 1;
                right = i + nums.length - 1;
                break;
            }
        }
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid % nums.length] == target)
                return mid % nums.length;
            else if (nums[mid % nums.length] > target)
                right = mid - 1;
            else
                left = mid + 1;
        }
        if (nums[left % nums.length] == target)
            return left % nums.length;
        else
            return -1;
    }
}
*/

// 请将给出的罗马数字转化为整数
// 保证输入的数字范围在1 到 3999之间。

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        System.out.println(new Solution().romanToInt("DCXXI"));
    }

    public int romanToInt(String s) {
        // write code here
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] strs = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int temp = 0;

        StringBuilder s1 = new StringBuilder(s);
        for (int i = 0; i < values.length; i++) {
            while (s1.indexOf(strs[i]) == 0) {
                temp += values[i];
                s1.delete(0, strs[i].length());
            }
        }
        return temp;
    }
}
