package MaximumTwinSumOfALinkedList;

public class Main {
    public static void main(String[] args) {
        // 5 -> 4 -> 2 -> 1
        ListNode head = new ListNode(5);
        head.next = new ListNode(4);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(1);

        Solution solution = new Solution();

        int result = solution.pairSum(head);

        System.out.println(result);
    }
}
