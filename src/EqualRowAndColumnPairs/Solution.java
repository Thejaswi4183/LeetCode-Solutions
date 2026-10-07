package EqualRowAndColumnPairs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {

    public int equalPairs(int[][] grid) {
        int n = grid.length;

        Map<List<Integer>, Integer> rowMap = new HashMap<>();

        for (int i = 0; i < n; i++) {
            List<Integer> row = new ArrayList<>();

            for (int j = 0; j < n; j++) {
                row.add(grid[i][j]);
            }

            rowMap.put(row, rowMap.getOrDefault(row, 0) + 1);
        }

        int count = 0;

        for (int j = 0; j < n; j++) {
            List<Integer> column = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                column.add(grid[i][j]);
            }

            count += rowMap.getOrDefault(column, 0);
        }

        return count;
    }
}
