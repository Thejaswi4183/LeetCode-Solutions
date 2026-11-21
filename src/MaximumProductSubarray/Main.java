package MaximumProductSubarray;

public class Main {
    public static void main(String[] args) {
        int[] nums = {2, 3, -2, 4};
        Solution solution = new Solution();

        int answer = solution.maxProduct(nums);
        System.out.println(answer);
    }
}
