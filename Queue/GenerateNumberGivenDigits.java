package SummerTrainingGFG.Queue;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Vishal Singh
 */
public class GenerateNumberGivenDigits {
    static void printFirstN(int n){
        Queue<String> q = new LinkedList<>();
        /*
        * You can enqueu any number here which you want to be in the number printed*/
        q.offer("5");
        q.offer("6");
        for (int i = 0; i < n; i++) {
            String curr = q.poll();
            System.out.println(curr);
            q.offer(curr+"5");
            q.offer(curr+"6");
        }
    }
    public static void main(String[] args) {
        printFirstN(6);
    }
}
