package IPO;

public class Main {
    public static void main(String[] args) {
        int k = 2, w = 0;
        int[] profits = {1, 2, 3}, capital = {0, 1, 1};

        Solution solution = new Solution();
        System.out.println(solution.findMaximizedCapital(k, w, profits, capital));
    }
}

