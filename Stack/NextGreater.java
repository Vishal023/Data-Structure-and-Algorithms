package SummerTrainingGFG.Stack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

/**
 * @author Vishal Singh
 */
public class NextGreater {
    public static void main(String[] args) {
        int[] arr = {5,15,10,8,6,12,9,18};
        //          {15,18,12,12,12,18,18,-1}
        ArrayList<Integer> list = new ArrayList<>();
        Stack<Integer> stack  = new Stack<>();
        list.add(-1);
        stack.push(arr[arr.length-1]);
        for (int i = arr.length-2; i >=0; i--) {
            while (!stack.isEmpty() && stack.peek()<= arr[i]){
                stack.pop();
            }
            int ng = stack.empty()?-1: stack.peek();
            list.add(ng);
            stack.push(arr[i]);
        }
        Collections.reverse(list);
        System.out.println(list);
    }
}
