package FirstOccuranceInString;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test cases
        String haystack1 = "hello";
        String needle1 = "ll";
        System.out.println("Index: " + solution.strStr(haystack1, needle1));  // Output: 2

        String haystack2 = "aaaaa";
        String needle2 = "bba";
        System.out.println("Index: " + solution.strStr(haystack2, needle2));  // Output: -1

        String haystack3 = "";
        String needle3 = "";
        System.out.println("Index: " + solution.strStr(haystack3, needle3));  // Output: 0
    }
}
