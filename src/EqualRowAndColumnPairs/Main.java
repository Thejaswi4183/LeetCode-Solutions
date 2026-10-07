package EqualRowAndColumnPairs;

public class Main {

    public static void main(String[] args) {

        int[][] grid = {
                {3, 2, 1},
                {1, 7, 6},
                {2, 7, 7}
        };

        Solution solution = new Solution();

        int result = solution.equalPairs(grid);

        System.out.println(result);
    }
}
