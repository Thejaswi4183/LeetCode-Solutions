package InterleavingString;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.isInterleave("aabcc", "dbbca", "aadbbcbcac"));
        System.out.println(sol.isInterleave("aabcc", "dbbca", "aadbbbaccc"));
        System.out.println(sol.isInterleave("", "", ""));
        System.out.println(sol.isInterleave("abc", "def", "adbcef"));
    }
}
