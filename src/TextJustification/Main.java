package TextJustification;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        String[] words = {"This", "is", "an", "example", "of", "text", "justification."};

        int maxWidth = 16;

        Solution solution = new Solution();

        List<String> result = solution.fullJustify(words, maxWidth);

        for (String line : result) {
            System.out.println("|" + line + "|");
        }
    }
}
