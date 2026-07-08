package RemoveNthNodeFromEndOfList;

public class Main {

    public static void main(String[] args) {

        // Creating list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        int n = 2;
        System.out.println("Before Deletion:");
        printList(head);
        Solution solution = new Solution();
        ListNode result = solution.removeNthFromEnd(head, n);
        System.out.println("\nAfter Deletion:");
        printList(result);
    }

    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val);

            if (head.next != null) {
                System.out.print(" -> ");
            }

            head = head.next;
        }
    }
}