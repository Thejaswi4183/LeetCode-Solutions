package SwapNodesInPairs;

public class Main {

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);

        System.out.println("Before swapping:");
        printList(head);

        Solution solution = new Solution();
        head = solution.swapPairs(head);

        System.out.println("After swapping:");
        printList(head);
    }

    private static void printList(ListNode head) {
        ListNode temp = head;

        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }
}
