package SuccessfulPairsOfSpellsAndPotions;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] spells = {5, 1, 3};
        int[] potions = {1, 2, 3, 4, 5};
        long success = 7;

        Solution solution = new Solution();

        int[] result = solution.successfulPairs(spells, potions, success);

        System.out.println(Arrays.toString(result));
    }
}
