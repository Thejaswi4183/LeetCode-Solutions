package SubarraySumEqualsK;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {1, 2, 3};
        int k = 3;

        int result = sol.subarraySum(nums, k);
        System.out.println(result);
    }
}
