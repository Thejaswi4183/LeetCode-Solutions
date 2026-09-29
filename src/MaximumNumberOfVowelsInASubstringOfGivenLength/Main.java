package MaximumNumberOfVowelsInASubstringOfGivenLength;

public class Main {
    public static void main(String[] args) {

        Solution solution = new Solution();

        String s = "abciiidef";
        int k = 3;

        int result = solution.maxVowels(s, k);

        System.out.println(result);
    }
}
