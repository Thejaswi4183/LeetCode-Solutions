package LongestCommonSubsequence;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String text1 = "abcde";
        String text2 = "ace";

        int result = sol.longestCommonSubsequence(text1, text2);
        System.out.println(result);
    }
}
