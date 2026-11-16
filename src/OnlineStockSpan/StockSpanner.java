package OnlineStockSpan;

import java.util.ArrayDeque;
import java.util.Deque;

class StockSpanner {
    Deque<int[]> deque;

    public StockSpanner() {
        deque = new ArrayDeque<>();
    }

    public int next(int price) {

        int span = 1;

        while (!deque.isEmpty() && deque.peek()[0] <= price) {
            span += deque.pop()[1];
        }

        deque.push(new int[]{price, span});

        return span;
    }
}
