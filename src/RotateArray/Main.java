package RotateArray;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Solution sol = new Solution();

        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;

        sol.rotate(nums, k);

        System.out.println("Rotated Array: " + Arrays.toString(nums));
    }
}