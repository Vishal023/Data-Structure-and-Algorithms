package Heap;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.PriorityQueue;

/**
 * @author Vishal Singh
 * 7/25/2021
 * @link https://leetcode.com/problems/reorganize-string/
 */


/*
 * Given a string s, rearrange the characters of s so that any two adjacent characters are not the same.
 * Return any possible rearrangement of s or return "" if not possible.
 * Example 1:
 * Input: s = "aab"
 * Output: "aba"
 * Example 2:
 * Input: s = "aaab"
 * Output: ""
 * */
public class ReorganizeString {
    class Pair implements Comparable<Pair> {
        char ch;
        int freq;

        public Pair(char ch, int freq) {
            this.ch = ch;
            this.freq = freq;
        }

        @Override
        public int compareTo(Pair pair) {
            return this.freq - pair.freq;
        }
    }

    class Solution {
        public String reorganizeString(String s) {
            char[] arr = s.toCharArray();
            HashMap<Character, Integer> freq = new HashMap<>();
            for (char ch : arr)
                freq.put(ch, freq.getOrDefault(ch, 0) + 1);


            
            PriorityQueue<Pair> pq = new PriorityQueue<>(Collections.reverseOrder());



            for (char key : freq.keySet()) {
                pq.add(new Pair(key, freq.get(key)));
            }
            StringBuilder sb = new StringBuilder();
            Pair wait = null;
            while (!pq.isEmpty() || wait != null) {
                if (pq.isEmpty()) {
                    pq.add(wait);
                    wait = null;
                }
                Pair p = pq.poll();
                sb.append(p.ch);
                if (wait != null) {
                    pq.add(wait);
                }
                if (p.freq == 1) {
                    wait = null;
                } else {
                    wait = new Pair(p.ch, p.freq - 1);
                }
            }
            boolean poss = true;
            for (int i = 0; i < sb.length() - 1; i++) {
                if (sb.charAt(i) == sb.charAt(i + 1)) {
                    poss = false;
                    break;
                }
            }
            if (!poss) return "";
            return sb.toString();
        }
    }
}