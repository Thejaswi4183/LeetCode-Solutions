package MaxNumberOfKSumPairs;

public class Main {

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4};
        int k = 5;

        Solution solution = new Solution();

        int result = solution.maxOperations(nums, k);

        System.out.println(result);
    }
}
