package EvaluateDivision;

import java.util.*;

class Solution {
    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        Map<String, Map<String, Double>> graph = new HashMap<>();

        for (int i = 0; i < equations.size(); i++) {
            String a = equations.get(i).get(0), b = equations.get(i).get(1);
            graph.putIfAbsent(a, new HashMap<>());
            graph.putIfAbsent(b, new HashMap<>());
            graph.get(a).put(b, values[i]);
            graph.get(b).put(a, 1.0 / values[i]);
        }

        double[] ans = new double[queries.size()];

        for (int i = 0; i < queries.size(); i++) {
            String a = queries.get(i).get(0), b = queries.get(i).get(1);
            if (!graph.containsKey(a) || !graph.containsKey(b))
                ans[i] = -1.0;
            else if (a.equals(b))
                ans[i] = 1.0;
            else
                ans[i] = dfs(graph, a, b, 1.0, new HashSet<>());
        }

        return ans;
    }

    private double dfs(Map<String, Map<String, Double>> graph, String cur, String target, double product,
                       Set<String> visited) {
        if (cur.equals(target))
            return product;
        visited.add(cur);

        for (Map.Entry<String, Double> entry : graph.get(cur).entrySet()) {
            if (!visited.contains(entry.getKey())) {
                double result = dfs(graph, entry.getKey(), target, product * entry.getValue(), visited);
                if (result != -1.0)
                    return result;
            }
        }

        return -1.0;
    }
}
