package MinCostClimbingStairs;

public class Main {
    public static void main(String[] args) {
        int[] cost = {10, 15, 20};
        Solution obj = new Solution();

        int result = obj.minCostClimbingStairs(cost);
        System.out.println(result);
    }
}
