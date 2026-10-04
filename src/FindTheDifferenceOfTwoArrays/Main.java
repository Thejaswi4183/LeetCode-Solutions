package FindTheDifferenceOfTwoArrays;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        int[] nums1 = {1, 2, 3};
        int[] nums2 = {2, 4, 6};

        Solution solution = new Solution();

        List<List<Integer>> result = solution.findDifference(nums1, nums2);

        System.out.println(result);
    }
}

