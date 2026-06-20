package FindPeakElement;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] nums1 = {1, 2, 3, 1};
        int peak1 = sol.findPeakElement(nums1);
        System.out.println(peak1);

        int[] nums2 = {1, 2, 1, 3, 5, 6, 4};
        int peak2 = sol.findPeakElement(nums2);
        System.out.println(peak2);
    }
}