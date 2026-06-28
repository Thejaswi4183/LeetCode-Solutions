package GameOfLife;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[][] board = {
                {0, 1, 0},
                {0, 0, 1},
                {1, 1, 1},
                {0, 0, 0}
        };

        System.out.println("Original Board:");
        printBoard(board);

        Solution solution = new Solution();
        solution.gameOfLife(board);

        System.out.println("\nNext Generation:");
        printBoard(board);
    }

    static void printBoard(int[][] board) {
        for (int[] row : board) {
            System.out.println(Arrays.toString(row));
        }
    }
}