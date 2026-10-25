package ReorderRoutesToMakeAllPathsLeadToTheCityZero;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int n = 6;

        int[][] connections = {
                {0, 1},
                {1, 3},
                {2, 3},
                {4, 0},
                {4, 5}
        };

        int result = solution.minReorder(n, connections);

        System.out.println(result);
    }
}
