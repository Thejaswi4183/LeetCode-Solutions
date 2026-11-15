package DailyTemperatures;

import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] answer = new int[n];

        Deque<Integer> deque = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {

            while (!deque.isEmpty() && temperatures[i] > temperatures[deque.peek()]) {

                int prevIndex = deque.pop();
                answer[prevIndex] = i - prevIndex;
            }

            deque.push(i);
        }

        return answer;
    }
}
