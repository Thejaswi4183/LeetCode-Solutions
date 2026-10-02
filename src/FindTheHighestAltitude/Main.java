package FindTheHighestAltitude;

public class Main {
    public static void main(String[] args) {

        int[] gain = {-5, 1, 5, 0, -7};

        Solution solution = new Solution();

        int answer = solution.largestAltitude(gain);

        System.out.println(answer);
    }
}


