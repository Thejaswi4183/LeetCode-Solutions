package ContainsDuplicate;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums1 = {1, 2, 3, 1};
        int[] nums2 = {1, 2, 3, 4};
        int[] nums3 = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        System.out.println(solution.containsDuplicate(nums1)); // true
        System.out.println(solution.containsDuplicate(nums2)); // false
        System.out.println(solution.containsDuplicate(nums3)); // true
    }
}