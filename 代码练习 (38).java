package 日常练习.杨辉三角;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 陈子豪
 * Date: 2021-06-06
 * Time: 16:09
 */
//给定一个非负整数 numRows，生成杨辉三角的前 numRows 行。
//
//
//
//在杨辉三角中，每个数是它左上方和右上方的数的和。
//
//示例:
//
//输入: 5
//输出:
//[
//     [1],
//    [1,1],
//   [1,2,1],
//  [1,3,3,1],
// [1,4,6,4,1]
//]
//
//来源：力扣（LeetCode）
//链接：https://leetcode-cn.com/problems/pascals-triangle
//著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。

class Solution {
    public List<List<Integer>> generate(int numRows) {
        if(numRows == 0){
            return null;
        }
        List<List<Integer>> lists=new ArrayList<>();
        List<Integer> row1 =new ArrayList<>();
        row1.add(1);
        lists.add(row1);
        for(int i =1; i < numRows; i++){
            List<Integer> row =new ArrayList<>();
            row.add(1);

            for(int j = 1; j < i; j++){
                row.add(lists.get(i - 1).get(j)+lists.get(i - 1).get(j - 1));
            }

            row.add(1);
            lists.add(row);
        }
        return lists;
    }
}
