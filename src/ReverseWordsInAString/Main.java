package ReverseWordsInAString;

public class Main {

    public static void main(String[] args) {
        Solution sol = new Solution();
        String s = "  the sky   is blue  ";
        String result = sol.reverseWords(s);
        System.out.println("Output: " + result);
    }
}