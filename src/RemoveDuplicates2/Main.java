package RemoveDuplicates2;

public class Main {
    public static void main(String[] args) {

        Solution solution = new Solution();

        int[] nums = {1, 1, 1, 2, 2, 3};

        int k = solution.removeDuplicates(nums);

        System.out.print("Output: " + k + ", nums = [");

        for (int i = 0; i < nums.length; i++) {

            if (i < k) {
                System.out.print(nums[i]);
            } else {
                System.out.print("_");
            }

            if (i < nums.length - 1) {
                System.out.print(",");
            }
        }

        System.out.println("]");
    }
}