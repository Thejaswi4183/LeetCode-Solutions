package WordBreak;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String s = "leetcode";
        List<String> wordDict = Arrays.asList("leet", "code");

        Solution solution = new Solution();
        boolean result = solution.wordBreak(s, wordDict);
        System.out.println(result);
    }
}
