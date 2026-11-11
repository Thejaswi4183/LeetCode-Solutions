package CountingBits;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int n = 5;
        Solution sol = new Solution();

        int[] result = sol.countBits(n);

        System.out.println(Arrays.toString(result));
    }
}
