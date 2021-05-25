//给定一个数组，请你编写一个函数，返回该数组排序后的形式。

import java.util.*;


public class Solution {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     * 将给定数组排序
     *
     * @param arr int整型一维数组 待排序的数组
     * @return int整型一维数组
     */
    public int[] MySort(int[] arr) {
        quickSort(arr, 0, arr.length - 1);
        return arr;
    }

    private void quickSort(int[] arr, int start, int end) {
        if (start >= end) return;
        int low = start, high = end;
        int temp = arr[low];
        while (low < high) {
            while (low < high && temp <= arr[high]) high--;
            while (low < high && temp >= arr[low]) low++;
            if (low < high) {
                int t = arr[low];
                arr[low] = arr[high];
                arr[high] = t;
            }
        }
        arr[start] = arr[low];
        arr[low] = temp;
        quickSort(arr, start, low - 1);
        quickSort(arr, low + 1, end);
    }
}
