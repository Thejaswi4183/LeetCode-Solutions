package FindAllAnagramsInAString;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        String s = "cbaebabacd";
        String p = "abc";

        List<Integer> result = solution.findAnagrams(s, p);
        System.out.println(result);
    }
}
