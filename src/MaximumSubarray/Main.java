package MaximumSubarray;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int result = sol.maxSubArray(nums);
        System.out.println(result);
    }
}