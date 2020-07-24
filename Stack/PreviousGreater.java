package SummerTrainingGFG.Stack;

import java.util.Stack;

/**
 * @author Vishal Singh
 *
 * : -> To find the closest previous greater
 */
public class PreviousGreater {
    public static void main(String[] args) {
        int[] arr = {15, 10, 18, 12, 4, 6, 2, 8};
        //        = {-1, 15  -1  18 12 12  6 12}
        Stack<Integer> previousGreat = new Stack<>();
        previousGreat.push(arr[0]);
        System.out.print("-1 ");
        for (int i = 1; i < 8; i++) {
            while (!previousGreat.isEmpty() && previousGreat.peek() <= arr[i]){
                previousGreat.pop();
            }
            int pg = previousGreat.empty() ? -1 : previousGreat.peek();
            System.out.print(pg+" ");
            previousGreat.push(arr[i]);
        }
    }
}
