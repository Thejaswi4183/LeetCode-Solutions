package SearchA2DMatrix;

public class Main {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 60}
        };
        int target = 3;
        Solution sol = new Solution();
        boolean result = sol.searchMatrix(matrix, target);
        System.out.println(result);
    }
}