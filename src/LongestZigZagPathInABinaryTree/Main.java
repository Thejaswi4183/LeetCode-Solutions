package LongestZigZagPathInABinaryTree;

public class Main {
    public static void main(String[] args) {
        /*
                 1
                / \
               2   3
                \
                 4
                /
               5
                \
                 6
        */

        TreeNode root = new TreeNode(1);

        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.right = new TreeNode(4);
        root.left.right.left = new TreeNode(5);
        root.left.right.left.right = new TreeNode(6);

        Solution solution = new Solution();

        int result = solution.longestZigZag(root);

        System.out.println(result);
    }
}
