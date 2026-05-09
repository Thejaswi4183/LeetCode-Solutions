package MajorityElement;

public class Main {

    public static void main(String[] args) {

        int[] nums = {2, 2, 1, 1, 1, 2, 2};

        Solution solution = new Solution();

        int result = solution.majorityElement(nums);

        System.out.println("Majority Element: " + result);
    }
}