package FindMedianFromDataStream;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

class MedianFinder {
    private final Queue<Integer> left;
    private final Queue<Integer> right;

    public MedianFinder() {
        left = new PriorityQueue<>(Collections.reverseOrder());
        right = new PriorityQueue<>();
    }

    public void addNum(int num) {
        if (left.size() == right.size()) {
            right.offer(num);
            left.offer(right.poll());
        } else {
            left.offer(num);
            right.offer(left.poll());
        }
    }

    @SuppressWarnings("DataFlowIssue")
    public double findMedian() {
        if (left.size() == right.size()) {
            return (left.peek() + right.peek()) / 2.0;
        }

        return left.peek();
    }
}
