package SearchInRotatedSortedArray;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;
        int result = sol.search(nums, target);
        System.out.println(result);
    }
}