package ValidParentheses;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        String s = "{[()]}";

        boolean result = solution.isValid(s);

        System.out.println(result);
    }
}
