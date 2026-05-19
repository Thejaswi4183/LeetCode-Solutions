package ContainsDuplicateII;

public class Main {

    public static void main(String[] args) {
        Solution obj = new Solution();
        int[] nums = {1, 2, 3, 1};
        int k = 3;
        boolean result = obj.containsNearbyDuplicate(nums, k);
        System.out.println(result);
    }
}