package SummaryRanges;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {0, 1, 2, 4, 5, 7};
        List<String> result = sol.summaryRanges(nums);
        System.out.println(result);
    }
}