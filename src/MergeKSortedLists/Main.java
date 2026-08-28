package MergeKSortedLists;

public class Main {

    public static void main(String[] args) {

        // List 1: 1 -> 4 -> 5
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(4);
        list1.next.next = new ListNode(5);

        // List 2: 1 -> 3 -> 4
        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(3);
        list2.next.next = new ListNode(4);

        // List 3: 2 -> 6
        ListNode list3 = new ListNode(2);
        list3.next = new ListNode(6);

        ListNode[] lists = {list1, list2, list3};

        Solution solution = new Solution();
        ListNode result = solution.mergeKLists(lists);
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

        System.out.println();
    }
}

