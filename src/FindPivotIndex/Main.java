package FindPivotIndex;

public class Main {

    public static void main(String[] args) {

        int[] nums = {1, 7, 3, 6, 5, 6};

        Solution solution = new Solution();

        int result = solution.pivotIndex(nums);

        System.out.println(result);
    }
}
