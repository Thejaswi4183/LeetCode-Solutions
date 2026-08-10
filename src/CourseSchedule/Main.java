package CourseSchedule;

public class Main {

    public static void main(String[] args) {

        Solution solution = new Solution();

        int numCourses = 3;

        int[][] prerequisites = {
                {1, 0},
                {2, 1}
        };

        boolean result = solution.canFinish(numCourses, prerequisites);

        System.out.println(result);
    }
}
