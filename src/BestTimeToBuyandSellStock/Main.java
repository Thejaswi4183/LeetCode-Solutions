package BestTimeToBuyandSellStock;

public class Main {

    public static void main(String[] args) {

        int[] prices = {7, 1, 5, 3, 6, 4};

        Solution sol = new Solution();

        int result = sol.maxProfit(prices);

        System.out.println("Maximum Profit: " + result);
    }
}