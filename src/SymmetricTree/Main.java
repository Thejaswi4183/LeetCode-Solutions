package SymmetricTree;
public class Main {
    public static void main(String[] args) {

        // Constructing the following symmetric tree:
        //
        //         1
        //       /   \
        //      2     2
        //     / \   / \
        //    3   4 4   3
        //

        TreeNode root = new TreeNode(
                1,
                new TreeNode(
                        2,
                        new TreeNode(3),
                        new TreeNode(4)
                ),
                new TreeNode(
                        2,
                        new TreeNode(4),
                        new TreeNode(3)
                )
        );

        Solution solution = new Solution();
        System.out.println(solution.isSymmetric(root));
    }
}