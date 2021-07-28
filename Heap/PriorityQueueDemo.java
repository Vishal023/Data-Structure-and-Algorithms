package SummerTrainingGFG.Heap;

import java.util.Collections;
import java.util.PriorityQueue;

/**
 * @author Vishal Singh
 * 16-01-2021
 */
public class PriorityQueueDemo {
    /*
    * By defaul it is Min heap*/
    public static void main(String[] args) {
        /*
        * Min Heap*/
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(10);
        pq.add(1010);
        pq.add(110);
        pq.add(0);
        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq.peek());
        /*
        * Max Heap*/
        PriorityQueue<Integer> max = new PriorityQueue<>(Collections.reverseOrder());
        max.add(10);
        max.add(100);
        max.add(1);
        System.out.println(max);
        System.out.println(max.poll());
        System.out.println(max.peek());
    }
}