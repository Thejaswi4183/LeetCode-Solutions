package SortList;

public class Main {

    public static void main(String[] args) {

        // 4 -> 2 -> 1 -> 3
        ListNode head = new ListNode(4);
        head.next = new ListNode(2);
        head.next.next = new ListNode(1);
        head.next.next.next = new ListNode(3);

        System.out.println("Before:");
        printList(head);

        Solution solution = new Solution();
        head = solution.sortList(head);

        System.out.println("After:");
        printList(head);
    }

    static void printList(ListNode head) {

        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }
}
