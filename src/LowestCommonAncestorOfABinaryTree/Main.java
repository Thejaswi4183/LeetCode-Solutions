package LowestCommonAncestorOfABinaryTree;

public class Main {

    public static void main(String[] args) {

        /*
                    3
                  /   \
                 5     1
                / \   / \
               6   2 0   8
                  / \
                 7   4
        */

        TreeNode root = new TreeNode(3);

        root.left = new TreeNode(5);
        root.right = new TreeNode(1);

        root.left.left = new TreeNode(6);
        root.left.right = new TreeNode(2);

        root.right.left = new TreeNode(0);
        root.right.right = new TreeNode(8);

        root.left.right.left = new TreeNode(7);
        root.left.right.right = new TreeNode(4);

        Solution solution = new Solution();

        TreeNode lca = solution.lowestCommonAncestor(root, root.left, root.right);

        System.out.println("Lowest Common Ancestor: " + lca.val);
    }
}
