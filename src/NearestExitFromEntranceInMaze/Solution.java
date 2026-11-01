package NearestExitFromEntranceInMaze;

import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int nearestExit(char[][] maze, int[] entrance) {
        int m = maze.length;
        int n = maze[0].length;

        Queue<int[]> q = new LinkedList<>();
        boolean[][] visited = new boolean[m][n];

        q.offer(new int[]{entrance[0], entrance[1], 0});
        visited[entrance[0]][entrance[1]] = true;

        int[][] directions = {
                {0, 1},
                {0, -1},
                {1, 0},
                {-1, 0}
        };

        while (!q.isEmpty()) {
            int[] curr = q.poll();

            int r = curr[0];
            int c = curr[1];
            int steps = curr[2];

            for (int[] dir : directions) {
                int nr = r + dir[0];
                int nc = c + dir[1];

                if (nr < 0 || nc < 0 ||nr >= m || nc >= n || maze[nr][nc] == '+' || visited[nr][nc]) {
                    continue;
                }

                if (nr == 0 || nc == 0 ||
                        nr == m - 1 || nc == n - 1) {
                    return steps + 1;
                }

                visited[nr][nc] = true;
                q.offer(new int[]{nr, nc, steps + 1});
            }
        }

        return -1;
    }
}
