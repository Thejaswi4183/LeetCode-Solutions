package AsteroidCollision;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] asteroids = {5, 10, -5};

        int[] result = sol.asteroidCollision(asteroids);

        System.out.println(Arrays.toString(result));
    }
}
