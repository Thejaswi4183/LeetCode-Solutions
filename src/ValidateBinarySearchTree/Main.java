package ValidateBinarySearchTree;

public class Main {

    public static void main(String[] args) {

        /*
                 8
               /   \
              3     10
             / \      \
            1   6      14
               / \
              4   7
        */

        TreeNode root = new TreeNode(8);

        root.left = new TreeNode(3);
        root.right = new TreeNode(10);

        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(6);

        root.left.right.left = new TreeNode(4);
        root.left.right.right = new TreeNode(7);

        root.right.right = new TreeNode(14);

        Solution solution = new Solution();

        boolean result = solution.isValidBST(root);

        System.out.println(result);
    }
}
