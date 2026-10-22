package DeleteNodeInABST;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        /*
                  50
                 /  \
               30    70
              / \    / \
             20  40 60  80

             Delete key = 50

                  60
                 /  \
               30    70
              / \      \
             20  40     80
        */

        TreeNode root = new TreeNode(50);
        root.left = new TreeNode(30);
        root.right = new TreeNode(70);
        root.left.left = new TreeNode(20);
        root.left.right = new TreeNode(40);
        root.right.left = new TreeNode(60);
        root.right.right = new TreeNode(80);

        Solution solution = new Solution();
        root = solution.deleteNode(root, 50);

        System.out.println(toLevelOrder(root));
    }

    private static List<String> toLevelOrder(TreeNode root) {
        List<String> result = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();

            if (node == null) {
                result.add("null");
                continue;
            }

            result.add(String.valueOf(node.val));
            queue.offer(node.left);
            queue.offer(node.right);
        }

        while (!result.isEmpty()
                && result.get(result.size() - 1).equals("null")) {
            result.remove(result.size() - 1);
        }

        return result;
    }
}
