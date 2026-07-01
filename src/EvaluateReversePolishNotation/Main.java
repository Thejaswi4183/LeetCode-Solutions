package EvaluateReversePolishNotation;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String[] tokens = {"2", "2", "+", "3", "*"};
        System.out.println(sol.evalRPN(tokens)); // 12
    }
}