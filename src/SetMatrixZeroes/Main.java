package SetMatrixZeroes;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 1, 1},
                {1, 0, 1},
                {1, 1, 1}
        };
        Solution sol = new Solution();
        sol.setZeroes(matrix);
        System.out.println(Arrays.deepToString(matrix));
    }
}