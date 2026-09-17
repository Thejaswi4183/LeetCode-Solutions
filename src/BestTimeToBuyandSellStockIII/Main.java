package BestTimeToBuyandSellStockIII;

public class Main {
    public static void main(String[] args) {
        int[] prices = {3, 3, 5, 0, 0, 3, 1, 4};
        Solution solution = new Solution();

        int result = solution.maxProfit(prices);
        System.out.println(result);
    }
}
