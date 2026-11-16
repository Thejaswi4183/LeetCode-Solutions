package OnlineStockSpan;

public class Main {
    public static void main(String[] args) {
        StockSpanner stockSpanner = new StockSpanner();

        int[] prices = {100, 80, 60, 70, 60, 75, 85};

        for (int price : prices) {
            System.out.println("Price: " + price + " | Span: " + stockSpanner.next(price));
        }
    }
}
