package trie;

import java.util.*;

/**
 * @author Vishal Singh
 * 7/23/2021
 */


public class CamelCase {

    class Solution {
        class Trie {
            boolean isEnd;
            ArrayList<String> list = new ArrayList<>();
            Trie[] map;

            Trie() {
                map = new Trie[256];
            }

            @Override
            public String toString() {
                return "Trie{" +
                        "list=" + list +
                        ", map=" + Arrays.toString(map) +
                        '}';
            }
        }

        void insert(String word, Trie root) {
            for (char ch : word.toCharArray()) {
                if (ch >= 'A' && ch <= 'Z') {
                    if (root.map[ch] == null) {
                        root.map[ch] = new Trie();
                    }
                    root = root.map[ch];
                }
            }
            root.list.add(word);
            root.isEnd = true;
        }

        void searchPatten(Trie root, String pattern) {
            int i = 0;
            int n = pattern.length();
            boolean found = true;
            while (i < n) {
                char ch = pattern.charAt(i);
                if (root.map[ch] != null) {
                    root = root.map[ch];
                }
                else {
                    found = false;
                }
                i++;
            }
            if (!found) {
                System.out.print("No match found");
                return;
            }
            print(root);
        }

        void print(Trie root) {
            if (root.isEnd) {
                for (String word: root.list) {
                    System.out.print(word+" ");
                }
            }
            for (int i = 0; i < 256; i++) {
                Trie child = root.map[i];
                if (child != null) {
                    print(child);
                }
            }
        }

        void findAllWords(String[] dict, String pattern) {
            Trie root = new Trie();
            for (String word : dict) {
                insert(word, root);
            }
            searchPatten(root, pattern);
        }
    }


    public static void main(String[] args) {
        // Link to the question
        /*
         * @link
         * https://practice.geeksforgeeks.org/problems/camelcase-pattern-matching2259/1/
         * */
        String[] dict = {"Hi", "Hello", "HelloWorld", "HiTech",
                "HiGeek", "HiTechWorld", "HiTechCity", "HiTechLab"};
        String pattern = "HT";
        CamelCase c = new CamelCase();
        CamelCase.Solution s = c.new Solution();
        s.findAllWords(dict, pattern);
    }
}