package FindDuplicates;

//import java.util.ArrayList;
//import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

class Solution {
    public List<Integer> findDuplicates(int[] nums) {

        List <Integer>ans = new LinkedList<>();
        int n = nums.length;
        for(int i=0;i<n;i++)
        {
            int index =  Math.abs(nums[i]) - 1;
            if(nums[index]<0)
            {
                ans.add (index+1);
            }
            else
            {
                nums[index] = nums[index] * -1;
            }
        }
        return ans;

    }
}
//Discarded using HashMap Code since the Runtime is higher
//class Solution {
//    public List<Integer> findDuplicates(int[] nums) {
//        HashMap<Integer, Integer> countMap = new HashMap<>();
//        List<Integer> result = new ArrayList<>();
//
//        for (int num : nums) {
//            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
//        }
//
//        for (int key : countMap.keySet()) {
//            if (countMap.get(key) == 2) {
//                result.add(key);
//            }
//        }
//
//        return result;
//    }
//}