package SummerTrainingGFG.Queue;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

/**
 * @author Vishal Singh
 */
public class ReverseQueue {
    /*
    * Iterative Approach*/
    static void reverse(Queue<Integer> q){
        Stack<Integer> s = new Stack<>();
        while (!q.isEmpty()){
            s.push(q.remove());
        }
        while (!s.isEmpty()){
            q.offer(s.pop());
        }
    }
    public static void main(String[] args) {
        Queue<Integer> q = new ArrayDeque<>();
        q.offer(3);
        q.offer(2);
        q.offer(1);
        System.out.println(q);
        reverse(q);
        System.out.println(q);
    }
}
