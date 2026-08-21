package N_Queens;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        Solution solution = new Solution();
        int n = 4;

        List<List<String>> result = solution.solveNQueens(n);
        System.out.println(result);
    }
}

