package NearestExitFromEntranceInMaze;

public class Main {
    public static void main(String[] args) {

        char[][] maze = {
                {'+', '+', '.', '+'},
                {'.', '.', '.', '+'},
                {'+', '+', '+', '.'}
        };

        int[] entrance = {1, 2};

        Solution sol = new Solution();
        int result = sol.nearestExit(maze, entrance);

        System.out.println(result);
    }
}
