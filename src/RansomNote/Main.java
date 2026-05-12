package RansomNote;

public class Main {

    public static void main(String[] args) {

        Solution sol = new Solution();

        String ransomNote = "aa";
        String magazine = "aab";

        boolean result = sol.canConstruct(ransomNote, magazine);

        System.out.println(result);
    }
}