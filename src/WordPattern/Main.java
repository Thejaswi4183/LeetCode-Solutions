package WordPattern;

public class Main {

    public static void main(String[] args) {

        Solution sol = new Solution();

        String pattern1 = "abba";
        String s1 = "dog cat cat dog";

        String pattern2 = "abba";
        String s2 = "dog cat cat fish";

        System.out.println(sol.wordPattern(pattern1, s1)); // true
        System.out.println(sol.wordPattern(pattern2, s2)); // false
    }
}