package trie;

/**
 * @author Vishal Singh
 * 7/23/2021
 * @link https://practice.geeksforgeeks.org/problems/most-frequent-word-in-an-array-of-strings3528/1
 */
public class MostFrequentWord {
    class Solution {
        class Trie {
            int freq;
            boolean isEnd;
            Trie[] children = new Trie[26];
        }
        int max = 0;
        String mostFrequent = "";
        void insert(Trie root,String word) {
            Trie curr = root;
            for (char ch: word.toCharArray()) {
                if (curr.children[ch-'a'] == null) {
                    curr.children[ch-'a'] = new Trie();
                }
                curr = curr.children[ch-'a'];
            }
            curr.isEnd = true;
            curr.freq++;
            if (curr.freq > max) {
                mostFrequent = word;
                max = curr.freq;
            }
        }
        public String mostFrequentWord(String arr[], int n) {
            max = 0;
            mostFrequent = "";
            Trie root = new Trie();
            for (String word: arr) {
                insert(root,word);
            }
            return mostFrequent;
        }
    }
    /*
    Corner Test Case:
    17
    xejdcj xejdcj lvjpb tmyuiu lvjpb tmyuiu ovoba lvjpb lvjpb fqhyu fqhyu tmyuiu xejdcj tmyuiu fqhyu ovoba xejdcj
    * */
}