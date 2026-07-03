package FindFirstAndLastPositionOfElementInSortedArray;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] nums1 = {5,7,7,8,8,10};
        int target1 = 8;
        System.out.println(Arrays.toString(sol.searchRange(nums1, target1)));

        int[] nums2 = {1,2,3,3,3,4,5};
        int target2 = 3;
        System.out.println(Arrays.toString(sol.searchRange(nums2, target2)));

        int[] nums3 = {2,2,2,2};
        int target3 = 2;
        System.out.println(Arrays.toString(sol.searchRange(nums3, target3)));

        int[] nums4 = {1,2,3};
        int target4 = 4;
        System.out.println(Arrays.toString(sol.searchRange(nums4, target4)));
    }
}