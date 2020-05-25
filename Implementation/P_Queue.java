package SummerTrainingGFG.Implementation;
import java.util.LinkedList;
import java.util.Queue;
/**
 * @author Vishal Singh */
public class P_Queue {
    public static void main(String[] args) {
        //Queue<Integer> q = new PriorityQueue<Integer>();
        Queue<Integer> l = new LinkedList<Integer>();
        for (int i = 0; i < 4 ; i++) {
            l.add(i+777);
        }
        System.out.println(l);
        for (int i = 0; i < 4; i++) {
            System.out.println(l.poll());
        }
    }
}
