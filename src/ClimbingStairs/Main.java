package ClimbingStairs;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int n = 5;
        int ways = solution.climbStairs(n);

        System.out.println("Number of ways to climb " + n + " stairs: " + ways);
    }
}
