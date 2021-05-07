// 给定一个数组和一个值，使用就地算法将数组中所有等于这个值的元素删除，并返回新数组的长度。
// 元素的顺序可以更改。你不用去关心大于当前数组长度的空间里面存储的值

public class Solution {
    public int removeElement(int[] A, int elem) {
        if (A == null || A.length == 0)
            return 0;
        int len = A.length;
        for (int i = 0; i < len; i++) {
            if (A[i] == elem) {
                A[i] = A[len - 1];
                len--;
                i--;
            }
        }
        return len;
    }
}