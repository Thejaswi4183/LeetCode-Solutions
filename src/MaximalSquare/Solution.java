package MaximalSquare;

class Solution {
    public int maximalSquare(char[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        int[][] dp = new int[m + 1][n + 1];

        int maxSide = 0;

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {

                if (matrix[i - 1][j - 1] == '1') {

                    int top = dp[i - 1][j];
                    int left = dp[i][j - 1];
                    int diagonal = dp[i - 1][j - 1];

                    dp[i][j] = 1 + Math.min(top, Math.min(left, diagonal));

                    maxSide = Math.max(maxSide, dp[i][j]);
                }
            }
        }

        return maxSide * maxSide;
    }
}
