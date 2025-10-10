package LinkedListAddition;
public class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }
    ListNode(int val) {
        this.val = val;
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode current = result;
        int carry = 0;
        while (l1 != null || l2 != null) {
            int a = l1 == null ? 0 : l1.val;
            int b = l2 == null ? 0 : l2.val;
            int sum = a + b + carry;
            current.next = new ListNode(sum%10);
            current = current.next;
            carry = sum/10;
            l1 = l1 == null ? null : l1.next;
            l2 = l2 == null ? null : l2.next;
        }

        if (carry != 0) current.next = new ListNode(carry);

        return result.next;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(5);
        l1.next=new ListNode(6);
        l1.next.next=new ListNode(4);
        ListNode l2 = new ListNode(1);
        l2.next=new ListNode(0);
        l2.next.next=new ListNode(0);
        l2.next.next.next=new ListNode(0);
        l2.next.next.next.next=new ListNode(0);
        l2.next.next.next.next.next=new ListNode(0);
        l2.next.next.next.next.next.next=new ListNode(0);
        l2.next.next.next.next.next.next.next=new ListNode(0);
        l2.next.next.next.next.next.next.next.next=new ListNode(0);
        l2.next.next.next.next.next.next.next.next.next=new ListNode(1);
        ListNode l4=new ListNode();
        l4=l4.addTwoNumbers(l1,l2);
        while (l4 != null) {
            System.out.print(l4.val);
            l4 = l4.next;
        }
        System.out.println();
    }
}