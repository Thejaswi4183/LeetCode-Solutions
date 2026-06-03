package GasStation;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] gas = {2, 3, 4, 5};
        int[] cost = {3, 4, 5, 1, 2};
        int result = sol.canCompleteCircuit(gas, cost);
        System.out.println("Starting index: " + result);
    }
}