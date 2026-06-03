package GasStation;

class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalGas = 0, totalCost = 0, currTank = 0, start = 0;
        for (int i = 0; i < gas.length; i++) {
            totalGas += gas[i];
            totalCost += cost[i];
            currTank += gas[i] - cost[i];
            if (currTank < 0) {
                start = i + 1;
                currTank = 0;
            }
        }
        return totalGas < totalCost ? -1 : start;
    }
}