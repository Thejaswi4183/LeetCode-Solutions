package LengthOfLastWord;
//runtime:0ms
class Solution {
    public int lengthOfLastWord(String s) {
        int len=0;
        int i=s.length()-1;
        while(i>=0 && s.charAt(i)==' '){
            i--;
        }
        while(i>=0 && s.charAt(i)!=' '){
            len++;
            i--;
        }
        return len;
    }
}

//runtime:1ms
//class Solution {
//    public int lengthOfLastWord(String s) {
//        String[] words=s.trim().split(" ");
//        String last=words[words.length-1];
//        return last.length();
//    }
//}

// runtime:2ms
//class Solution {
//    public int lengthOfLastWord(String s) {
//        String[] words=s.trim().split("\\s+");
//        String last=words[words.length-1];
//        return last.length();
//    }
//}