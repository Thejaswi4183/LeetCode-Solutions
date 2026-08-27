package ConstructQuadTree;

class Solution {
    public Node construct(int[][] grid) {
        return solve(grid, 0, 0, grid.length);
    }

    private Node solve(int[][] grid, int row, int col, int size) {
        boolean same = true;
        for (int i = row; i < row + size && same; i++) {
            for (int j = col; j < col + size; j++) {
                if (grid[i][j] != grid[row][col]) {
                    same = false;
                    break;
                }
            }
        }

        if (same)
            return new Node(grid[row][col] == 1, true);

        int half = size / 2;

        Node topLeft = solve(grid, row, col, half);
        Node topRight = solve(grid, row, col + half, half);
        Node bottomLeft = solve(grid, row + half, col, half);
        Node bottomRight = solve(grid, row + half, col + half, half);

        return new Node(true, false, topLeft, topRight, bottomLeft, bottomRight);
    }
}
