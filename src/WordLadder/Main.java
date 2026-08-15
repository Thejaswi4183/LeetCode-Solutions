package WordLadder;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Solution solution = new Solution();

        String beginWord = "hit";
        String endWord = "cog";

        List<String> wordList = Arrays.asList("hot", "dot", "dog", "lot", "log", "cog");

        int result = solution.ladderLength(beginWord, endWord, wordList);

        System.out.println(result);
    }
}
