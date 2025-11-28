package ValidAnagram;

//Solution 1 (Frequency Array) : 2ms runtime
// Advantage: Fastest runtime and constant space for a-z lowercase letters.
class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        int[] count = new int[26];

        for (char c : s.toCharArray()) {
            count[c - 'a']++;
        }

        for (char c : t.toCharArray()) {
            count[c - 'a']--;
            if (count[c - 'a'] < 0) return false;
        }

        return true;
    }
}

//Solution 2 (Sorting) : 4 runtime
// Advantage: Very simple and easy to understand using built-in sorting.
//import java.util.Arrays;
//
//class Solution {
//    public boolean isAnagram(String s, String t) {
//        if (s.length() != t.length())
//            return false;
//
//        char[] a = s.toCharArray();
//        char[] b = t.toCharArray();
//        Arrays.sort(a);
//        Arrays.sort(b);
//
//        return Arrays.equals(a, b);
//    }
//}

//Solution 3 (HashMap) : 15ms runtime
// Advantage: Works for all Unicode characters, not just a-z.
//import java.util.HashMap;
//import java.util.Map;
//
//class Solution {
//    public boolean isAnagram(String s, String t) {
//        if (s.length() != t.length()) {
//            return false;
//        }
//        Map<Character, Integer> map = new HashMap<>();
//        for (char ch : s.toCharArray()) {
//            map.put(ch, map.getOrDefault(ch, 0) + 1);
//        }
//        for (char ch : t.toCharArray()) {
//            if (!map.containsKey(ch) || map.get(ch) == 0)
//                return false;
//            map.put(ch, map.get(ch) - 1);
//        }
//        return true;
//    }
//}