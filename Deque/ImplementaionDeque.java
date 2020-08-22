package SummerTrainingGFG.Deque;

import java.util.ArrayDeque;

/**
 * @author Vishal Singh
 */
public class ImplementaionDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        deque.offerFirst(1);
        deque.offerLast(1);
        deque.addFirst(1);
        deque.addLast(1);
        System.out.println(deque);
    }
}
