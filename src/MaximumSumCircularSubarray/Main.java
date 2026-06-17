package MaximumSumCircularSubarray;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums1 = {1, -2, 3, -2};
        System.out.println(sol.maxSubarraySumCircular(nums1));
        int[] nums2 = {5, -3, 5};
        System.out.println(sol.maxSubarraySumCircular(nums2));
        int[] nums3 = {-3, -2, -5};
        System.out.println(sol.maxSubarraySumCircular(nums3));
        int[] nums4 = {10, -5, 10, -30, 6};
        System.out.println(sol.maxSubarraySumCircular(nums4));
    }
}