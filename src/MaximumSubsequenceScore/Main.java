package MaximumSubsequenceScore;

public class Main {
    public static void main(String[] args) {
        int[] nums1 = {1, 3, 3, 2};
        int[] nums2 = {2, 1, 3, 4};
        int k = 3;

        Solution solution = new Solution();
        long result = solution.maxScore(nums1, nums2, k);

        System.out.println(result);
    }
}
