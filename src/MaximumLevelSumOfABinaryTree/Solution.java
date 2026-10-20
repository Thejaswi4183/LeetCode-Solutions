package MaximumLevelSumOfABinaryTree;

import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int maxLevelSum(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        int level = 1;
        int maxSum = Integer.MIN_VALUE;
        int result = 1;

        while (!queue.isEmpty()) {
            int size = queue.size();
            int sum = 0;

            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                //noinspection DataFlowIssue
                sum += node.val;

                if (node.left != null) {
                    queue.offer(node.left);
                }

                if (node.right != null) {
                    queue.offer(node.right);
                }
            }

            if (sum > maxSum) {
                maxSum = sum;
                result = level;
            }

            level++;
        }

        return result;
    }
}
