package UniquePaths;

public class Main {
    public static void main(String[] args) {
        int m = 3;
        int n = 7;
        Solution solution = new Solution();

        int answer = solution.uniquePaths(m, n);
        System.out.println(answer);
    }
}

