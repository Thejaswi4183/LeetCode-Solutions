package HowManyNumbersAreSmallerThanTheCurrentNumber;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums = {8, 1, 2, 2, 3};

        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.smallerNumbersThanCurrent(nums)));
    }
}
