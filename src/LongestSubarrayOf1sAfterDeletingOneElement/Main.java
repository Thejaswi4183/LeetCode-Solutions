package LongestSubarrayOf1sAfterDeletingOneElement;

public class Main {

    public static void main(String[] args) {

        int[] nums = {1, 1, 0, 1, 1, 1};

        Solution solution = new Solution();

        int result = solution.longestSubarray(nums);

        System.out.println(result);
    }
}
