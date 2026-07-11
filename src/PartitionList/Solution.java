package PartitionList;

class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode lesserDummy = new ListNode(0);
        ListNode greaterDummy = new ListNode(0);

        ListNode lesser = lesserDummy;
        ListNode greater = greaterDummy;

        while (head != null) {
            if (head.val < x) {
                lesser.next = head;
                lesser = lesser.next;
            } else {
                greater.next = head;
                greater = greater.next;
            }
            head = head.next;
        }

        greater.next = null;
        lesser.next = greaterDummy.next;

        return lesserDummy.next;
    }
}