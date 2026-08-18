package Combinations;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        Solution solution = new Solution();
        int n = 4;
        int k = 2;

        List<List<Integer>> result = solution.combine(n, k);
        System.out.println(result);
    }
}

