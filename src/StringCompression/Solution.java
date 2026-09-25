package StringCompression;

class Solution {
    public int compress(char[] chars) {
        int pos = 0;

        for (int i = 0; i < chars.length; ) {
            char ch = chars[i];
            int count = 0;

            while (i < chars.length && chars[i] == ch) {
                i++;
                count++;
            }

            chars[pos++] = ch;

            if (count > 1) {
                String num = String.valueOf(count);

                for (char c : num.toCharArray()) {
                    chars[pos++] = c;
                }
            }
        }

        return pos;
    }
}
