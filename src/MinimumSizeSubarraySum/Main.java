package MinimumSizeSubarraySum;

public class Main {
    public static void main(String[] args) {

        Solution sol = new Solution();

        int target = 7;
        int[] nums = {2, 3, 1, 2, 4, 3};

        int result = sol.minSubArrayLen(target, nums);

        System.out.println("Minimum Length: " + result);
    }
}