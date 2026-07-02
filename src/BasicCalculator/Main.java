package BasicCalculator;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.calculate("1 + 1"));               // 2
        System.out.println(sol.calculate("2-1+2"));               // 3
        System.out.println(sol.calculate("(1+(4+5+2)-3)+(6+8)")); // 23
        System.out.println(sol.calculate("1-(2+3)"));             // -4
    }
}