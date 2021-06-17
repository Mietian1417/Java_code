/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 陈子豪
 * Date: 2021-06-17
 * Time: 20:19
 */
public class Test {
    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        TreeNode root = binaryTree.createTree();

        binaryTree.preOrderTraversal(root);
        System.out.println();
        binaryTree.inOrderTraversal(root);
        System.out.println();
        binaryTree.postOrderTraversal(root);
        System.out.println();

        binaryTree.getSize1(root);
        System.out.println(BinaryTree.size);

        System.out.println(binaryTree.getSize2(root));
    }
}
