package MaximalSquare;

public class Main {

    public static void main(String[] args) {

        char[][] matrix = {
                {'1', '0', '1', '0', '0'},
                {'1', '0', '1', '1', '1'},
                {'1', '1', '1', '1', '1'},
                {'1', '0', '0', '1', '0'}
        };

        Solution solution = new Solution();

        int result = solution.maximalSquare(matrix);

        System.out.println(result);
    }
}
