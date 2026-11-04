package CombinationSumIII;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        int k = 3;
        int n = 7;

        Solution obj = new Solution();

        List<List<Integer>> result = obj.combinationSum3(k, n);
        System.out.println(result);
    }
}

