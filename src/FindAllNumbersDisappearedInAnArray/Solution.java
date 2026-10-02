package FindAllNumbersDisappearedInAnArray;

import java.util.*;

//In-place Marking Approach - Time Complexity: O(n), Space Complexity: O(1) (excluding the output list)
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;

            if (nums[index] > 0) {
                nums[index] = -nums[index];
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                result.add(i + 1);
            }
        }

        return result;
    }
}

//HashSet Approach - Time Complexity: O(n), Space Complexity: O(n)
//class Solution {
//    public List<Integer> findDisappearedNumbers(int[] nums) {
//        Set<Integer> set = new HashSet<>();
//        List<Integer> result = new ArrayList<>();
//
//        for (int num : nums) {
//            set.add(num);
//        }
//
//        for (int i = 1; i <= nums.length; i++) {
//            if (!set.contains(i)) {
//                result.add(i);
//            }
//        }
//
//        return result;
//    }
//}
