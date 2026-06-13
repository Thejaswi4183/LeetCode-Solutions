package MergeIntervals;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[][] intervals = {{1, 3},{2, 6},{8, 10},{15, 18}};
        int[][] result = sol.merge(intervals);
        System.out.println(Arrays.deepToString(result));
    }
}