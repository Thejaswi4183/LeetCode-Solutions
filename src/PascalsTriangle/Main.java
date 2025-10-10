package PascalsTriangle;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int numRows = 5;

        List<List<Integer>> triangle = solution.generate(numRows);

        // Print the Pascal's Triangle
        System.out.println("Pascal's Triangle with " + numRows + " rows:");
        for (List<Integer> row : triangle) {
            System.out.println(row);
        }
    }
}