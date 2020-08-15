package SummerTrainingGFG.Queue;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Vishal Singh
 */
public class QueueImplementation {
    public static void main(String[] args) {

        // do not throw exception
        Queue<Integer> q1 = new LinkedList<>(); //
        Queue<Integer> q2 = new ArrayDeque<>(); // prefferred
        q1.offer(1);
        q1.offer(10);
        q1.offer(100);
        System.out.println(q1);
        q2.offer(11);
        q2.offer(111);
        System.out.println(q2.peek());
        System.out.println(q2.poll());
        //throw exception
        // element add remove
    }
}
