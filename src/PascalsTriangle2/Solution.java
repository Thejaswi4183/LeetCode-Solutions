package PascalsTriangle2;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public static List<Integer> getRow(int rowIndex) {
        List<Integer> row, prev = null;
        for (int i = 0; i <= rowIndex; i++) {
            row = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    row.add(1);
                } else {
                    assert prev != null;
                    row.add(prev.get(j - 1) + prev.get(j));
                }
            }
            prev = row;
        }
        return prev;
    }
}