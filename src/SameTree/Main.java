package SameTree;

public class Main {
    public static void main(String[] args) {

        // Tree 1
        //      1
        //     / \
        //    2   3
        TreeNode tree1 = new TreeNode(
                1,
                new TreeNode(2),
                new TreeNode(3)
        );

        // Tree 2
        //      1
        //     / \
        //    2   3
        TreeNode tree2 = new TreeNode(
                1,
                new TreeNode(2),
                new TreeNode(3)
        );

        Solution solution = new Solution();

        boolean result = solution.isSameTree(tree1, tree2);

        System.out.println(result);
    }
}