package 日常练习.二叉树的中序遍历;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 陈子豪
 * Date: 2021-06-20
 * Time: 15:41
 */

//给定一个二叉树的根节点 root ，返回它的 中序 遍历。
//
//
//
//提示：
//
//    树中节点数目在范围 [0, 100] 内
//    -100 <= Node.val <= 100
//
//
//
//进阶: 递归算法很简单，你可以通过迭代算法完成吗？
//
//来源：力扣（LeetCode）
//链接：https://leetcode-cn.com/problems/binary-tree-inorder-traversal
//著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

/*
方法一：
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        middle(root,list);
        return list;
    }

    public void middle(TreeNode root, List<Integer> list){
        if(root == null){
            return;
        }

        middle(root.left,list);
        list.add(root.val);
        middle(root.right,list);
    }
}*/



/*
方法二：
class Solution {
    List<Integer> res = new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        if(root == null){
            return res;
        }
        inorderTraversal(root.left);
        res.add(root.val);
        inorderTraversal(root.right);
        return res;
    }
}*/

/*
方法三：
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        if (root == null) {
            return res;
        }

        List<Integer> leftTree = inorderTraversal(root.left);
        res.addAll(leftTree);


        res.add(root.val);

        List<Integer> rightTree = inorderTraversal(root.right);
        res.addAll(rightTree);

        return res;
    }
}
*/
