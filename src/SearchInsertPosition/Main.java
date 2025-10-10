package SearchInsertPosition;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] nums = {1, 3, 5, 6};
        int target = 2;

        int index = solution.searchInsert(nums, target);

        System.out.println("Insert position of " + target + " is: " + index);
    }
}
