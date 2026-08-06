package CloneGraph;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        // Create graph:
        // 1 -- 2
        // |    |
        // 4 -- 3

        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);

        node1.neighbors.add(node2);
        node1.neighbors.add(node4);

        node2.neighbors.add(node1);
        node2.neighbors.add(node3);

        node3.neighbors.add(node2);
        node3.neighbors.add(node4);

        node4.neighbors.add(node1);
        node4.neighbors.add(node3);

        Solution solution = new Solution();
        Node clonedGraph = solution.cloneGraph(node1);

        System.out.println("Original Graph:");
        printGraph(node1, new HashSet<>());

        System.out.println("\nCloned Graph:");
        printGraph(clonedGraph, new HashSet<>());
    }

    private static void printGraph(Node node, Set<Node> visited) {
        if (node == null || visited.contains(node)) {
            return;
        }

        visited.add(node);

        System.out.print("Node " + node.val + " -> ");

        for (Node neighbor : node.neighbors) {
            System.out.print(neighbor.val + " ");
        }

        System.out.println();

        for (Node neighbor : node.neighbors) {
            printGraph(neighbor, visited);
        }
    }
}
