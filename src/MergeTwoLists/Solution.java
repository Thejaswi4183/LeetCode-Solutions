package MergeTwoLists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        List<Integer> list3 = new ArrayList<>();
        while(list1!=null)
        {
            list3.add(list1.val);
            list1=list1.next;
        }
        while(list2!=null)
        {
            list3.add(list2.val);
            list2=list2.next;
        }
        Collections.sort(list3);
        ListNode result=new ListNode(-1);
        ListNode temp=result;
        for (Integer integer : list3) {
            result.next = new ListNode(integer);
            result = result.next;
        }
        return temp.next;
    }
}