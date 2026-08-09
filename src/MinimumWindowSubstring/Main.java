package MinimumWindowSubstring;

public class Main {
    public static void main(String[] args) {

        Solution solution = new Solution();
        String s = "ADOBECODEBANC";
        String t = "ABC";

        String answer = solution.minWindow(s, t);

        System.out.println(answer);
    }
}
