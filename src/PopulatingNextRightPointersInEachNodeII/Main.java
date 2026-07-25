package PopulatingNextRightPointersInEachNodeII;

public class Main {

    public static void main(String[] args) {

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(7);

        Solution solution = new Solution();
        root = solution.connect(root);

        Node levelStart = root;
        while (levelStart != null) {
            Node current = levelStart;
            levelStart = null;

            while (current != null) {
                System.out.print(current.val + " -> ");

                if (levelStart == null) {
                    if (current.left != null) {
                        levelStart = current.left;
                    } else if (current.right != null) {
                        levelStart = current.right;
                    }
                }

                current = current.next;
            }

            System.out.println("NULL");
        }
    }
}