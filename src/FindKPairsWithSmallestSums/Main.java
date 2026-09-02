package FindKPairsWithSmallestSums;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] nums1 = {1, 7, 11};
        int[] nums2 = {2, 4, 6};
        int k = 3;

        Solution sol = new Solution();
        List<List<Integer>> result = sol.kSmallestPairs(nums1, nums2, k);
        System.out.println(result);
    }
}
