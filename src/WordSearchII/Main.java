package WordSearchII;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        char[][] board = {
                {'o', 'a', 'a', 'n'},
                {'e', 't', 'a', 'e'},
                {'i', 'h', 'k', 'r'},
                {'i', 'f', 'l', 'v'}
        };

        String[] words = {"oath", "pea", "eat", "rain"};
        Solution solution = new Solution();
        List<String> answer = solution.findWords(board, words);
        System.out.println(answer);
    }
}

