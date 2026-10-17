package LongestZigZagPathInABinaryTree;

class Solution {
    private int maxLength = 0;

    public int longestZigZag(TreeNode root) {
        dfs(root, 0, 0);
        return maxLength;
    }

    private void dfs(TreeNode node, int leftLength, int rightLength) {
        if (node == null) {
            return;
        }

        maxLength = Math.max(maxLength, Math.max(leftLength, rightLength));

        dfs(node.left, rightLength + 1, 0);

        dfs(node.right, 0, leftLength + 1);
    }
}
