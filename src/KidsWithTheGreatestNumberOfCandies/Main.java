package KidsWithTheGreatestNumberOfCandies;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] candies = {2, 3, 5, 1, 3};
        int extraCandies = 3;

        List<Boolean> result = solution.kidsWithCandies(candies, extraCandies);

        System.out.println(result);
    }
}
