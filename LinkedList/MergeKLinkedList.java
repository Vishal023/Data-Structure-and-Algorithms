package LinkedList;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * @author Vishal Singh
 * 7/25/2021
 * @link https://practice.geeksforgeeks.org/problems/merge-k-sorted-linked-lists/1
 */
public class MergeKLinkedList {
    class Node {
        int data;
        Node next;

        Node(int key) {
            data = key;
            next = null;
        }
    }

    class Solution {
        Node mergeKList(Node[] arr, int K) {
            PriorityQueue<Node> pq = new PriorityQueue<>((a, b) -> a.data - b.data);
            pq.addAll(Arrays.asList(arr));
            Node res = null, curr = null;
            while (!pq.isEmpty()) {
                Node temp = pq.poll();
                if (res == null) {
                    res = new Node(temp.data);
                    curr = res;
                }
                else {
                    curr.next = new Node(temp.data);
                    curr = curr.next;
                }
                if(temp.next != null) {
                    pq.add(temp.next);
                }
            }
            return res;
        }
    }
}