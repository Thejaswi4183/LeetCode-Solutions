package BinaryTreeMaximumPathSum;

public class Main {

    public static void main(String[] args) {

        /*
                  -10
                 /   \
                9     20
                     /  \
                    15   7

            Maximum Path = 15 + 20 + 7 = 42
        */

        TreeNode root = new TreeNode(-10);

        root.left = new TreeNode(9);

        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        Solution solution = new Solution();

        int answer = solution.maxPathSum(root);

        System.out.println(answer);
    }
}
