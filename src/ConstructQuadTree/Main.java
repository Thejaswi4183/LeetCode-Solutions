package ConstructQuadTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {

    static void printTree(Node root) {
        List<String> result = new ArrayList<>();
        Queue<Node> queue = new LinkedList<>();

        queue.offer(root);

        while (!queue.isEmpty()) {
            Node node = queue.poll();

            if (node == null) {
                result.add("null");
                continue;
            }

            result.add("[" + (node.isLeaf ? 1 : 0) + "," + (node.val ? 1 : 0) + "]");

            if (!node.isLeaf) {
                queue.offer(node.topLeft);
                queue.offer(node.topRight);
                queue.offer(node.bottomLeft);
                queue.offer(node.bottomRight);
            } else {
                queue.offer(null);
                queue.offer(null);
                queue.offer(null);
                queue.offer(null);
            }
        }

        while (!result.isEmpty() && result.get(result.size() - 1).equals("null")) {
            result.remove(result.size() - 1);
        }

        System.out.println(result);
    }

    public static void main(String[] args) {
        int[][] grid = {
                {1, 1, 1, 1, 0, 0, 0, 0},
                {1, 1, 1, 1, 0, 0, 0, 0},
                {1, 1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 0, 0, 0, 0},
                {1, 1, 1, 1, 0, 0, 0, 0},
                {1, 1, 1, 1, 0, 0, 0, 0},
                {1, 1, 1, 1, 0, 0, 0, 0}
        };

        Solution solution = new Solution();
        Node root = solution.construct(grid);

        printTree(root);
    }
}

