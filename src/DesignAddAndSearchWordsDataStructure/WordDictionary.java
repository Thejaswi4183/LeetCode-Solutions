package DesignAddAndSearchWordsDataStructure;

class WordDictionary {

    private static class TrieNode {
        TrieNode[] children = new TrieNode[26];
        boolean isEnd;
    }

    private final TrieNode root;

    public WordDictionary() {
        root = new TrieNode();
    }

    public void addWord(String word) {
        TrieNode curr = root;

        for (char c : word.toCharArray()) {
            int index = c - 'a';

            if (curr.children[index] == null) {
                curr.children[index] = new TrieNode();
            }

            curr = curr.children[index];
        }

        curr.isEnd = true;
    }

    public boolean search(String word) {
        return search(word, 0, root);
    }

    private boolean search(String word, int index, TrieNode curr) {

        if (index == word.length()) {
            return curr.isEnd;
        }

        char c = word.charAt(index);

        if (c != '.') {
            int childIndex = c - 'a';

            if (curr.children[childIndex] == null) {
                return false;
            }

            return search(word, index + 1, curr.children[childIndex]);
        }

        for (TrieNode child : curr.children) {
            if (child != null && search(word, index + 1, child)) {
                return true;
            }
        }

        return false;
    }
}

