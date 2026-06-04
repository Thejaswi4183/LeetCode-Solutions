package JumpGame;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums1 = {2, 3, 1, 1, 4};
        int[] nums2 = {3, 2, 1, 0, 4};
        System.out.println(sol.canJump(nums1));
        System.out.println(sol.canJump(nums2));
    }
}