package ConstructBinaryTreeFromInorderAndPostorderTraversal;

import java.util.HashMap;

class Solution {
    private int postIndex;
    private final HashMap<Integer, Integer> map = new HashMap<>();

    public TreeNode buildTree(int[] inorder, int[] postorder) {

        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }

        postIndex = postorder.length - 1;

        return build(postorder, 0, inorder.length - 1);
    }

    private TreeNode build(int[] postorder, int left, int right) {

        if (left > right) {
            return null;
        }

        TreeNode root = new TreeNode(postorder[postIndex--]);

        int mid = map.get(root.val);

        root.right = build(postorder, mid + 1, right);
        root.left = build(postorder, left, mid - 1);

        return root;
    }
}
