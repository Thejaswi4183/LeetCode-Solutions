package IsSubsequence;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();

        String s = "abc";
        String t = "ahbgdc";

        boolean result = sol.isSubsequence(s, t);

        System.out.println("Is subsequence: " + result);
    }
}