package CopyListWithRandomPointer;

public class Main {

    // Print the list
    public static void printList(Node head) {
        Node curr = head;

        while (curr != null) {
            System.out.print("Node: " + curr.val);

            if (curr.random != null)
                System.out.print(", Random -> " + curr.random.val);
            else
                System.out.print(", Random -> null");

            System.out.println();

            curr = curr.next;
        }
    }

    public static void main(String[] args) {

        // Create original list
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);

        n1.next = n2;
        n2.next = n3;

        // Random pointers
        n1.random = n3;
        n2.random = n1;
        n3.random = n2;

        System.out.println("Original List:");
        printList(n1);

        Solution sol = new Solution();
        Node copiedHead = sol.copyRandomList(n1);

        System.out.println("\nCopied List:");
        printList(copiedHead);

        // Modify original to prove deep copy
        n1.val = 100;

        System.out.println("\nAfter modifying original:");
        System.out.println("Original List:");
        printList(n1);

        System.out.println("\nCopied List (unchanged):");
        printList(copiedHead);
    }
}