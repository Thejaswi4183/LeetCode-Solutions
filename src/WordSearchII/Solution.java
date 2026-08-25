package WordSearchII;

import java.util.ArrayList;
import java.util.List;

class Solution {
    static class TrieNode {
        TrieNode[] children = new TrieNode[26];
        String word;
    }

    List<String> result = new ArrayList<>();

    public List<String> findWords(char[][] board, String[] words) {

        TrieNode root = new TrieNode();

        for (String word : words) {

            TrieNode node = root;

            for (char ch : word.toCharArray()) {
                int index = ch - 'a';

                if (node.children[index] == null) {
                    node.children[index] = new TrieNode();
                }

                node = node.children[index];
            }

            node.word = word;
        }
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                dfs(board, i, j, root);
            }
        }

        return result;
    }

    private void dfs(char[][] board, int row, int col, TrieNode node) {

        if (row < 0 || row >= board.length || col < 0 || col >= board[0].length || board[row][col] == '#') {
            return;
        }

        char ch = board[row][col];
        TrieNode next = node.children[ch - 'a'];

        if (next == null) {
            return;
        }

        if (next.word != null) {
            result.add(next.word);
            next.word = null;
        }

        board[row][col] = '#';

        dfs(board, row + 1, col, next);
        dfs(board, row - 1, col, next);
        dfs(board, row, col + 1, next);
        dfs(board, row, col - 1, next);

        board[row][col] = ch;
    }
}

