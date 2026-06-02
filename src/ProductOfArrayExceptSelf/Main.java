package ProductOfArrayExceptSelf;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {1, 2, 3, 4};
        int[] result = sol.productExceptSelf(nums);
        System.out.println("Input:  " + Arrays.toString(nums));
        System.out.println("Output: " + Arrays.toString(result));
    }
}