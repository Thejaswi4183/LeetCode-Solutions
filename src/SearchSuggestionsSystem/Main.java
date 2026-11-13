package SearchSuggestionsSystem;

public class Main {
    public static void main(String[] args) {
        String[] products = {"mobile", "mouse", "moneypot", "monitor", "mousepad"};

        Solution sol = new Solution();
        System.out.println(sol.suggestedProducts(products, "mouse"));
    }
}
