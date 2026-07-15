package InvertBinaryTree;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {

        // Input: [4,2,7,1,3,6,9]
        TreeNode root = new TreeNode(
                4,
                new TreeNode(
                        2,
                        new TreeNode(1),
                        new TreeNode(3)
                ),
                new TreeNode(
                        7,
                        new TreeNode(6),
                        new TreeNode(9)
                )
        );

        Solution solution = new Solution();

        System.out.print("Before: ");
        printTree(root);

        root = solution.invertTree(root);

        System.out.print("After: ");
        printTree(root);
    }


    public static void printTree(TreeNode root) {

        Queue<TreeNode> queue = new LinkedList<>();
        List<Integer> result = new ArrayList<>();

        queue.offer(root);

        while (!queue.isEmpty()) {

            TreeNode node = queue.poll();

            if (node == null) {
                continue;
            }

            result.add(node.val);

            queue.offer(node.left);
            queue.offer(node.right);
        }

        System.out.println(result);
    }
}