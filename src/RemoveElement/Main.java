package RemoveElement;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] nums = {0,1,2,2,3,0,4,2};
        int val = 2 ;

        int k = solution.removeElement(nums, val);

        System.out.println(k);
    }
}
