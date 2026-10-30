package TotalCostToHireKWorkers;

import java.util.PriorityQueue;

class Solution {
    public long totalCost(int[] costs, int k, int candidates) {
        PriorityQueue<Integer> left = new PriorityQueue<>();
        PriorityQueue<Integer> right = new PriorityQueue<>();
        int i = 0, j = costs.length - 1;

        while (i <= j && left.size() < candidates) {
            left.offer(costs[i++]);
        }
        while (i <= j && right.size() < candidates) {
            right.offer(costs[j--]);
        }

        long total = 0;

        for (int h = 0; h < k; h++) {
            if (right.isEmpty() || (!left.isEmpty() && left.peek() <= right.peek())) {
                //noinspection DataFlowIssue
                total += left.poll();
                if (i <= j)
                    left.offer(costs[i++]);
            } else {
                total += right.poll();
                if (i <= j)
                    right.offer(costs[j--]);
            }
        }

        return total;
    }
}
