package CoinChange;

import java.util.Arrays;

// Bottom-Up Approach
class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, amount + 1);

        dp[0] = 0;

        for (int i = 1; i <= amount; i++) {
            for (int coin : coins) {
                if (coin <= i) {
                    dp[i] = Math.min(dp[i], dp[i - coin] + 1);
                }
            }
        }

        return dp[amount] > amount ? -1 : dp[amount];
    }
}

// Top-Down Approach
/*
class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] memo = new int[amount + 1];
        Arrays.fill(memo, -2);

        return dfs(coins, amount, memo);
    }

    private int dfs(int[] coins, int amount, int[] memo) {
        if (amount == 0)
            return 0;
        if (amount < 0)
            return -1;

        if (memo[amount] != -2) {
            return memo[amount];
        }

        int min = Integer.MAX_VALUE;

        for (int coin : coins) {
            int result = dfs(coins, amount - coin, memo);

            if (result != -1) {
                min = Math.min(min, result + 1);
            }
        }

        memo[amount] = (min == Integer.MAX_VALUE) ? -1 : min;

        return memo[amount];
    }
}
*/
