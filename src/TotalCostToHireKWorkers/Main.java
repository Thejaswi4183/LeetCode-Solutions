package TotalCostToHireKWorkers;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] costs = {17, 12, 10, 2, 7, 2, 11, 20, 8};
        int k = 3, candidates = 4;
        System.out.println(sol.totalCost(costs, k, candidates));
    }
}
