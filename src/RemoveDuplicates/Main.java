package RemoveDuplicates;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] nums = {1, 1, 2, 2, 3, 3, 4};

        int k = solution.removeDuplicates(nums);

        System.out.println("k = " + k);
        System.out.print("Modified array: [");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i]);
            if (i < k - 1) System.out.print(", ");
        }
        System.out.println("]");
    }
}
