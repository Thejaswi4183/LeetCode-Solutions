package ValidAnagram;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();

        String s = "AnaGram";
        String t = "NaGAram";

        s = s.toLowerCase();
        t = t.toLowerCase();

        boolean result = sol.isAnagram(s, t);

        System.out.println(result);
    }
}
