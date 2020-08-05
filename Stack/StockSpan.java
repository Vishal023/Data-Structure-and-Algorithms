package SummerTrainingGFG.Stack;

import java.util.Arrays;
import java.util.Stack;

/**
 * @author Vishal Singh
 */
public class StockSpan {
    public static void main(String[] args) {
        int[] arr = {15,13,12,14,16,8,6,4,10,30};
        //Span arr= {1, 1, 1, 3, 5, 1,1,1, 1, 10}
        System.out.println(Arrays.toString(arr));
        Stack<Integer> span = new Stack<Integer>();
        span.push(0);
        System.out.print("1 ");
        for (int i = 1; i < 10; i++) {
            while (!span.isEmpty() && arr[span.peek()] <= arr[i]){
                span.pop();
            }
            int spanSize = span.empty()? (i+1) : (i - span.peek());
            System.out.print(spanSize+" ");
            span.push(i);
        }
    }
}
