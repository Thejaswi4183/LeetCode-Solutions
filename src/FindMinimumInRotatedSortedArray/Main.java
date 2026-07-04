package FindMinimumInRotatedSortedArray;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int result = solution.findMin(nums);
        System.out.println(result);
    }
}