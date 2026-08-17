package LetterCombinationsOfAPhoneNumber;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        Solution solution = new Solution();
        String digits = "23";

        List<String> result = solution.letterCombinations(digits);
        System.out.println(result);
    }
}
