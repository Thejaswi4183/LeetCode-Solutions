package NonOverlappingIntervals;

public class Main {
    public static void main(String[] args) {
        int[][] intervals = {
                {1, 2},
                {2, 3},
                {3, 4},
                {1, 3}
        };

        Solution sol = new Solution();

        int result = sol.eraseOverlapIntervals(intervals);
        System.out.println(result);
    }
}

