package PopulatingNextRightPointersInEachNode;

public class Main {

    public static void main(String[] args) {

        Node root = new Node(1);

        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(5);

        root.right.left = new Node(6);
        root.right.right = new Node(7);

        Solution solution = new Solution();
        root=solution.connect(root);

        printLevels(root);
    }

    private static void printLevels(Node root) {
        Node level = root;

        while (level != null) {
            Node current = level;

            while (current != null) {
                System.out.print(current.val + " -> ");
                if (current.next != null) {
                    System.out.print(current.next.val + "   ");
                } else {
                    System.out.print("null   ");
                }
                current = current.next;
            }

            System.out.println();
            level = level.left;
        }
    }
}
