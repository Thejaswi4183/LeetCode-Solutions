package MinimumWindowSubstring;

class Solution {
    public String minWindow(String s, String t) {
        int[] need = new int[128];

        for (char c : t.toCharArray()) {
            need[c]++;
        }

        int left = 0;
        int required = t.length();
        int start = 0;
        int minLength = Integer.MAX_VALUE;

        for (int right = 0; right < s.length(); right++) {
            char current = s.charAt(right);

            if (need[current] > 0) {
                required--;
            }
            need[current]--;

            while (required == 0) {
                int windowLength = right - left + 1;

                if (windowLength < minLength) {
                    minLength = windowLength;
                    start = left;
                }

                char removed = s.charAt(left);
                need[removed]++;

                if (need[removed] > 0) {
                    required++;
                }

                left++;
            }
        }

        return minLength == Integer.MAX_VALUE ? "" : s.substring(start, start + minLength);
    }
}
