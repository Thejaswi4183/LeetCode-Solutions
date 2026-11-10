package BestTimeToBuyAndSellStockWithTransactionFee;

public class Main {
    public static void main(String[] args) {
        int[] prices = {1, 3, 2, 8, 4, 9};
        int fee = 2;
        Solution obj = new Solution();
        int result = obj.maxProfit(prices, fee);
        System.out.println(result);
    }
}
