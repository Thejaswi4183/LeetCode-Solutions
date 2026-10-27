package SmallestNumberInInfiniteSet;

import java.util.HashSet;
import java.util.PriorityQueue;

@SuppressWarnings("FieldMayBeFinal")
class SmallestInfiniteSet {

    private int curr;
    private PriorityQueue<Integer> heap;
    private HashSet<Integer> set;

    public SmallestInfiniteSet() {
        curr = 1;
        heap = new PriorityQueue<>();
        set = new HashSet<>();
    }

    public int popSmallest() {
        if (!heap.isEmpty()) {
            int num = heap.poll();
            set.remove(num);
            return num;
        }

        return curr++;
    }

    public void addBack(int num) {
        if (num < curr && !set.contains(num)) {
            heap.offer(num);
            set.add(num);
        }
    }
}
