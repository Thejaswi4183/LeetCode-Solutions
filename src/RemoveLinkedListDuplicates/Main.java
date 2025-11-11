package RemoveLinkedListDuplicates;

public class Main {
    public static void main(String[] args) {
        // 1 -> 1 -> 2 -> 3 -> 3
        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(3);

        Solution solution = new Solution();
        ListNode result = solution.deleteDuplicates(head);

        System.out.print("List after removing duplicates: ");
        printList(result);
    }

    private static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val);
            if (current.next != null) System.out.print(" -> ");
            current = current.next;
        }
    }
}
