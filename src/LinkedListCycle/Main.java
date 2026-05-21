package LinkedListCycle;

public class Main {

    public static void main(String[] args) {

        int pos = 1;

        ListNode first = new ListNode(3);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(0);
        ListNode fourth = new ListNode(-4);

        first.next = second;
        second.next = third;
        third.next = fourth;

        ListNode[] nodes = {first, second, third, fourth};


        //noinspection UnclearExpression,ConstantValue
        if (pos >= 0 && pos < nodes.length) {
            fourth.next = nodes[pos];
        }

        Solution solution = new Solution();

        System.out.println(solution.hasCycle(first));
    }
}