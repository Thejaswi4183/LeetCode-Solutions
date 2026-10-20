package MaximumLevelSumOfABinaryTree;

public class Main {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(7);
        root.right = new TreeNode(0);
        root.left.left = new TreeNode(7);
        root.left.right = new TreeNode(-8);

        Solution solution = new Solution();
        System.out.println(solution.maxLevelSum(root));
    }
}