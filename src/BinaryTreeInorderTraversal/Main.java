package BinaryTreeInorderTraversal;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        Solution sol = new Solution();

        List<Integer> result = sol.inorderTraversal(root);

        System.out.println(result);
    }
}
