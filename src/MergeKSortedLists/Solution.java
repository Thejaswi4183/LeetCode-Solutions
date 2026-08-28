package MergeKSortedLists;

import java.util.PriorityQueue;

class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) {
            return null;
        }

        @SuppressWarnings("ComparatorCombinators")
        PriorityQueue<ListNode> minHeap = new PriorityQueue<>((a, b) -> a.val - b.val);

        for (ListNode node : lists) {
            if (node != null) {
                minHeap.offer(node);
            }
        }

        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;

        while (!minHeap.isEmpty()) {
            ListNode curr = minHeap.poll();
            tail.next = curr;
            tail = tail.next;

            if (curr.next != null) {
                minHeap.offer(curr.next);
            }
        }

        return dummy.next;
    }
}
