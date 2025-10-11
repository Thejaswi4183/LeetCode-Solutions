package FirstOccuranceInString;

class Solution {
    public int strStr(String haystack, String needle) {
        int nlen = needle.length();
        int hlen = haystack.length();
        if(nlen==0){
            return 0;
        }
        for (int i = 0; i <= hlen - nlen; i++) {
            if (haystack.substring(i, i + nlen).equals(needle)) {
                return i;
            }
        }
        return -1;
    }
}