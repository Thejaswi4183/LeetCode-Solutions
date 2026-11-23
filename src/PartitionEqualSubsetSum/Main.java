package PartitionEqualSubsetSum;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {1, 5, 11, 5};

        boolean result = sol.canPartition(nums);
        System.out.println(result);
    }
}
