package MaximumSumCircularSubarray;

class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int currMax = 0;
        int maxSum = nums[0];
        int currMin = 0;
        int minSum = nums[0];
        int total = 0;
        for (int num : nums) {
            total += num;

            currMax = Math.max(num, currMax + num);
            maxSum = Math.max(maxSum, currMax);

            currMin = Math.min(num, currMin + num);
            minSum = Math.min(minSum, currMin);
        }
        if (total == minSum) {
            return maxSum;
        }
        return Math.max(maxSum, total - minSum);
    }
}