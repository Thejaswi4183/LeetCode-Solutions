package RottingOranges;

public class Main {
    public static void main(String[] args) {
        int[][] grid = {
                {2, 1, 1},
                {1, 1, 0},
                {0, 1, 1}
        };

        Solution obj = new Solution();

        int result = obj.orangesRotting(grid);
        System.out.println(result);
    }
}
