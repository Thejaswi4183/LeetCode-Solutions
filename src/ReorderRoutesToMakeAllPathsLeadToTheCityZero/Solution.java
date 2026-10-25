package ReorderRoutesToMakeAllPathsLeadToTheCityZero;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public int minReorder(int n, int[][] connections) {
        List<int[]>[] graph = new ArrayList[n];

        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int[] road : connections) {
            int a = road[0];
            int b = road[1];

            graph[a].add(new int[] { b, 1 });
            graph[b].add(new int[] { a, 0 });
        }

        return dfs(0, -1, graph);
    }

    private int dfs(int city, int parent, List<int[]>[] graph) {
        int reversals = 0;

        for (int[] edge : graph[city]) {
            int neighbor = edge[0];
            int cost = edge[1];

            if (neighbor == parent) {
                continue;
            }

            reversals += cost;
            reversals += dfs(neighbor, city, graph);
        }

        return reversals;
    }
}
