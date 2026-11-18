package PalindromePartitioning;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String s = "aab";
        List<List<String>> result = sol.partition(s);
        System.out.println(result);
    }
}
