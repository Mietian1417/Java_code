/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 陈子豪
 * Date: 2021-06-17
 * Time: 20:10
 */
public class BinaryTree {
    public TreeNode createTree(){
        TreeNode A = new TreeNode('A');
        TreeNode B = new TreeNode('B');
        TreeNode C = new TreeNode('C');
        TreeNode D = new TreeNode('D');
        TreeNode E = new TreeNode('E');
        TreeNode F = new TreeNode('F');
        TreeNode G = new TreeNode('G');
        TreeNode H = new TreeNode('H');
        A.left = B;
        A.right = C;
        B.left = D;
        B.right = E;
        C.left = F;
        C.right = G;
        E.right = H;
        return A;
    }

    // 前序遍历
    void preOrderTraversal(TreeNode root){
        if(root == null){
            return;
        }
        System.out.print(root.value+" ");
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);

    }

    // 中序遍历
    void inOrderTraversal(TreeNode root){
        if(root == null){
            return;
        }
        inOrderTraversal(root.left);
        System.out.print(root.value+" ");
        inOrderTraversal(root.right);
    }

    // 后序遍历
    void postOrderTraversal(TreeNode root){
        if(root == null){
            return;
        }
        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.print(root.value+" ");
    }

    // 遍历思路-求结点个数
    static int size = 0;
    void getSize1(TreeNode root){
        if(root == null){
            return;
        }
        size++;
        getSize1(root.left);
        getSize1(root.right);
    }

    // 子问题思路-求结点个数
    int getSize2(TreeNode root){
        if(root == null){
            return 0;
        }
        return getSize2(root.left) + getSize2(root.right) + 1;
    }
}
