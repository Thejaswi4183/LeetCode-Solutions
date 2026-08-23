package GenerateParentheses;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int n = 3;

        List<String> result = solution.generateParenthesis(n);
        System.out.println(result);
    }
}
