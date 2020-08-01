package SummerTrainingGFG.Stack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

/**
 * @author Vishal Singh
 */
public class LargestRectangularArea {
    /*
    * O(n*n) - time
    * */
    static void naiveSol(int[] arr,int n){
        int res = 0;
        for (int i = 0; i < n; i++) {
            int curr = arr[i];
            for (int j = i-1; j >=0 ; j--) {
                if (arr[j] >= arr[i]){
                    curr+=arr[i];
                }else {
                    break;
                }
            }
            for (int j = i+1; j < n; j++) {
                if (arr[j]>=arr[i]){
                    curr+=arr[i];
                }
                else {
                    break;
                }
            }
            res = Math.max(res,curr);
        }
        System.out.println(res);
    }
    /*
     * O(n) - time complexity
     * Uses previous smaller and next smaller algorithms
     * */
    static ArrayList<Integer> prevSmaller(int[] arr){
        ArrayList<Integer> list = new ArrayList<>();
        Stack<Integer> previousSmaller = new Stack<>();
        previousSmaller.push(arr[0]);
        list.add(-1);
        for (int i = 1; i < arr.length; i++) {
            while (!previousSmaller.isEmpty() && arr[i]<=previousSmaller.peek()){
                previousSmaller.pop();
            }
            int pg = previousSmaller.empty() ? -1 : previousSmaller.peek();
            list.add(pg);
            previousSmaller.push(arr[i]);
        }
        return list;
    }
    static ArrayList<Integer> nextSmaller(int[] arr){
        ArrayList<Integer> list = new ArrayList<>();
        Stack<Integer> stack  = new Stack<>();
        stack.push(arr[arr.length-1]);
        for (int i = arr.length-1; i >=0; i--) {
            while (!stack.isEmpty() && stack.peek() >= arr[i]){
                stack.pop();
            }
            int ng = stack.empty()?arr.length: stack.peek();
            list.add(ng);
            stack.push(arr[i]);
        }
        Collections.reverse(list);
        return list;
    }
    static void betterSol(int[] arr,int n){
        ArrayList<Integer> ps = prevSmaller(arr);
        ArrayList<Integer> ns = nextSmaller(arr);
        System.out.println(ps);
        System.out.println(ns);
        int res = 0;
        for (int i = 0; i < n; i++) {
            int curr = arr[i];
            /*curr+=(i-arr[ps.get(i)]-1)*arr[i];
            curr+=(arr[ns.get(i)]-i-1)*arr[i];
            */res = Math.max(res,curr);
        }
        System.out.println(res);
    }
    public static void main(String[] args) {
        int[] arr = {6,2,5,4,1,5,6};
        naiveSol(arr,arr.length);
        betterSol(arr,arr.length);
    }
}
