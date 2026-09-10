package Triangle;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<List<Integer>> triangle = List.of(
                List.of(2),
                List.of(3, 4),
                List.of(6, 5, 7),
                List.of(4, 1, 8, 3)
        );

        Solution solution = new Solution();

        int answer = solution.minimumTotal(triangle);

        System.out.println("Minimum path sum : " + answer);
    }
}
