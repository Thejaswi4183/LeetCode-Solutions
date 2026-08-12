package SnakesAndLadders;

import java.util.ArrayDeque;
import java.util.Queue;

class Solution {
    public int snakesAndLadders(int[][] board) {
        int n = board.length;
        int target = n * n;

        Queue<Integer> queue = new ArrayDeque<>();
        boolean[] visited = new boolean[target + 1];

        queue.offer(1);
        visited[1] = true;

        int moves = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                //noinspection DataFlowIssue
                int current = queue.poll();

                if (current == target) {
                    return moves;
                }

                for (int dice = 1; dice <= 6; dice++) {
                    int next = current + dice;

                    if (next > target) {
                        break;
                    }

                    int[] pos = getPosition(next, n);
                    int row = pos[0];
                    int col = pos[1];

                    if (board[row][col] != -1) {
                        next = board[row][col];
                    }

                    if (!visited[next]) {
                        visited[next] = true;
                        queue.offer(next);
                    }
                }
            }

            moves++;
        }

        return -1;
    }

    private int[] getPosition(int square, int n) {
        int row = (square - 1) / n;
        int col = (square - 1) % n;

        if (row % 2 == 1) {
            col = n - 1 - col;
        }

        row = n - 1 - row;

        return new int[]{row, col};
    }
}
