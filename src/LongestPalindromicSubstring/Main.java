package LongestPalindromicSubstring;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        String input = "babad";

        String longest = solution.longestPalindrome(input);

        System.out.println("Longest palindromic substring: " + longest);
    }
}
