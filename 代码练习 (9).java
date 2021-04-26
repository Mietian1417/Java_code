// 你在爬楼梯，需要n步才能爬到楼梯顶部
// 每次你只能向上爬1步或者2步。有多少种方法可以爬到楼梯顶部？
// 用循坏代替递归
/*
import java.util.*;

public class test {

    public int climbStairs(int n) {
        int count = 1;
        int pre = 0;
        for (int i = 1; i <= n; i++) {
            int tmp = count;
            count += pre;
            pre = tmp;
        }
        return count;
    }
}
*/

//给定一个m*n的矩阵，如果有一个元素是0，
// 就把该元素所在的行和列上的元素全置为0，要求使用原地算法。
    
public class test {
    public void setZeroes(int[][] matrix) {
        boolean row = false,col=false;
        for (int i = 0; i < matrix[0].length; i ++ ) if(matrix[0][i] == 0) row = true;
        for (int i = 0; i < matrix.length; i ++ ) if(matrix[i][0] == 0) col = true;
        for (int i = 1; i < matrix.length; i ++ ) {
            for (int j = 1; j < matrix[0].length; j ++ ) {
                if(matrix[i][j] == 0) {
                    matrix[0][j] = 0;
                    matrix[i][0] = 0;
                }
            }
        }
        for (int i = 1; i < matrix.length; i ++ ) {
            for (int j = 1; j < matrix[0].length; j ++ ) {
                if(matrix[0][j]==0||matrix[i][0]==0) matrix[i][j] = 0;
            }
        }
        if(row) for (int i = 0; i < matrix[0].length; i ++ ) matrix[0][i] = 0;
        if(col) for (int i = 0; i < matrix.length; i ++ ) matrix[i][0] = 0;
    }
}