package NumberOfProvinces;

public class Main {
    public static void main(String[] args) {
        int[][] isConnected = {
                {1, 1, 0},
                {1, 1, 0},
                {0, 0, 1}
        };

        Solution solution = new Solution();

        int result = solution.findCircleNum(isConnected);

        System.out.println(result);
    }
}
