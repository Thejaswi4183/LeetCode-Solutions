package CountOddNumbers;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int low = 3;
        int high = 7;

        int count = solution.countOdds(low, high);

        System.out.println(count);
    }
}
