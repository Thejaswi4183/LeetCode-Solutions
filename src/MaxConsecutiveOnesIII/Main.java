package MaxConsecutiveOnesIII;

public class Main {

    public static void main(String[] args) {

        int[] nums = {1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0};
        int k = 2;

        Solution solution = new Solution();

        int result = solution.longestOnes(nums, k);

        System.out.println(result);
    }
}

