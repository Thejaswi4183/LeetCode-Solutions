package PLusOne;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] digits = {9, 9, 9};
        int[] result = solution.plusOne(digits);
        System.out.println("Output: " + Arrays.toString(result));
    }
}

