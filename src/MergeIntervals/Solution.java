package MergeIntervals;

import java.util.*;

class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));

//      Alternate way to sort
//      Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        List<int[]> result = new ArrayList<>();
        for (int[] interval : intervals) {
            if (result.isEmpty() ||
                    interval[0] > result.get(result.size() - 1)[1]) {
                result.add(interval);
            } else {
                int[] last = result.get(result.size() - 1);
                last[1] = Math.max(last[1], interval[1]);
            }
        }
        return result.toArray(new int[result.size()][]);
    }
}