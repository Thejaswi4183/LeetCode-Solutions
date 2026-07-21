package SumRootToLeafNumbers;

public class Main {
    public static void main(String[] args) {

        // Creating the tree:
        //       1
        //      / \
        //     2   3

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        Solution solution = new Solution();

        int result = solution.sumNumbers(root);
        System.out.println(result);
    }
}