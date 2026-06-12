package LongestConsecutiveSequence;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {100, 4, 200, 1, 3, 2};
        int result = solution.longestConsecutive(nums);
        System.out.println(result);
    }
}