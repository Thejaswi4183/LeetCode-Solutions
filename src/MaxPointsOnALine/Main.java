package MaxPointsOnALine;

public class Main {
    public static void main(String[] args) {
        int[][] points = {{1, 1}, {2, 2}, {3, 3}, {1, 3}};
        Solution solution = new Solution();

        int result = solution.maxPoints(points);
        System.out.println(result);
    }
}

