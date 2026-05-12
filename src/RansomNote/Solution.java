package RansomNote;

// Frequency Array Solution : ~1ms runtime
class Solution {

    public boolean canConstruct(String ransomNote, String magazine) {

        int[] count = new int[26];

        for (char c : magazine.toCharArray()) {
            count[c - 'a']++;
        }

        for (char c : ransomNote.toCharArray()) {

            if (count[c - 'a'] == 0) {
                return false;
            }

            count[c - 'a']--;
        }

        return true;
    }
}

//HashMap Solution : ~15ms runtime
//import java.util.HashMap;
//class Solution {
//    public boolean canConstruct(String ransomNote, String magazine) {
//        HashMap<Character, Integer> map = new HashMap<>();
//        for (char c : magazine.toCharArray()) {
//            map.put(c, map.getOrDefault(c, 0) + 1);
//        }
//        for(char c: ransomNote.toCharArray()){
//            if(!map.containsKey(c) || map.get(c) == 0){
//                return false;
//            }
//            map.put(c, map.get(c) - 1);
//        }
//        return true;
//    }
//}