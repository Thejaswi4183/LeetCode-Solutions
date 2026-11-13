package SearchSuggestionsSystem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {

    static class TrieNode {
        TrieNode[] children = new TrieNode[26];
        List<String> suggestions = new ArrayList<>();
    }

    TrieNode root = new TrieNode();

    public List<List<String>> suggestedProducts(String[] products, String searchWord) {

        Arrays.sort(products);

        for (String product : products) {
            TrieNode node = root;

            for (char ch : product.toCharArray()) {
                int index = ch - 'a';

                if (node.children[index] == null) {
                    node.children[index] = new TrieNode();
                }

                node = node.children[index];

                if (node.suggestions.size() < 3) {
                    node.suggestions.add(product);
                }
            }
        }

        List<List<String>> result = new ArrayList<>();
        TrieNode node = root;

        for (char ch : searchWord.toCharArray()) {

            int index = ch - 'a';

            node = node == null ? null : node.children[index];

            if (node == null) {
                result.add(new ArrayList<>());
            } else {
                result.add(node.suggestions);
            }
        }

        return result;
    }
}
