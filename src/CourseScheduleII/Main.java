package CourseScheduleII;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Solution solution = new Solution();

        int numCourses = 4;

        int[][] prerequisites = {
                {1, 0},
                {2, 0},
                {3, 1},
                {3, 2}
        };

        int[] result = solution.findOrder(numCourses, prerequisites);

        System.out.println(Arrays.toString(result));
    }
}
