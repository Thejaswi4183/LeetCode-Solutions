package UniqueNumberOfOccurrences;

public class Main {
    public static void main(String[] args) {

        Solution solution = new Solution();

        int[] arr = {1, 2, 2, 1, 1, 3};

        boolean result = solution.uniqueOccurrences(arr);

        System.out.println(result);
    }
}
