package CombinationSum;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        int[] candidates = {2, 3, 6, 7};
        int target = 7;
        Solution solution = new Solution();

        List<List<Integer>> result = solution.combinationSum(candidates, target);
        System.out.println(result);
    }
}
