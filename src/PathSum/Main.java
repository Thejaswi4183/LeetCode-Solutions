package PathSum;

public class Main {

    public static void main(String[] args) {

        /*
                 5
                / \
               4   8
              /   / \
             11  13  4
            /  \
           7    2

        Target Sum = 22
        */

        TreeNode root = new TreeNode(
                5,
                new TreeNode(
                        4,
                        new TreeNode(
                                11,
                                new TreeNode(7),
                                new TreeNode(2)
                        ),
                        null
                ),
                new TreeNode(
                        8,
                        new TreeNode(13),
                        new TreeNode(4)
                )
        );

        Solution solution = new Solution();

        int targetSum = 22;
        System.out.println(solution.hasPathSum(root, targetSum));
    }
}