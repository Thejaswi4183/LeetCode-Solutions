package TextJustification;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> result = new ArrayList<>();
        int i = 0;

        while (i < words.length) {
            int j = i;
            int wordLength = 0;

            while (j < words.length && wordLength + words[j].length() + (j - i) <= maxWidth) {
                wordLength += words[j].length();
                j++;
            }

            int wordCount = j - i;
            int spaces = maxWidth - wordLength;

            StringBuilder line = new StringBuilder();

            if (j == words.length || wordCount == 1) {

                for (int k = i; k < j; k++) {
                    if (k > i) {
                        line.append(" ");
                    }
                    line.append(words[k]);
                }

                while (line.length() < maxWidth) {
                    line.append(" ");
                }

            } else {
                int gaps = wordCount - 1;
                int spacesPerGap = spaces / gaps;
                int extraSpaces = spaces % gaps;

                for (int k = i; k < j; k++) {
                    line.append(words[k]);

                    if (k < j - 1) {
                        int count = spacesPerGap;

                        if (k - i < extraSpaces) {
                            count++;
                        }

                        line.append(" ".repeat(count));
                    }
                }
            }

            result.add(line.toString());
            i = j;
        }

        return result;
    }
}
