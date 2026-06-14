package InsertInterval;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] intervals = {{1, 3},{6, 9}};
        int[] newInterval = {2, 5};
        int[][] result = solution.insert(intervals, newInterval);
        System.out.println(Arrays.deepToString(result));
    }
}