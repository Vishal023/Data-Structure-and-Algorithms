package SummerTrainingGFG.Stack;

import java.util.Stack;

/*
*@author: Vishal Singh*/

public class Histogram1{
  public static void main(String[] args){
    int[] arr = {6,2,5,4,1,5,6};
    int n = arr.length;
    System.out.println(longestRectangularAreaInAHistogram(arr,n));
  }
  static int[] prevSmallerIndex(int[] arr,int n){
    int[] temp = new int[n];
    Stack<Integer> stack = new Stack<>();
    temp[0] = -1;
    stack.push(0);
    for (int i = 1; i < n ;i++ ){
      while(!stack.isEmpty() && arr[stack.peek()]>= arr[i]){
        stack.pop();
      }
      int ps = stack.isEmpty() ?-1:stack.peek();
      temp[i] = ps;
      stack.push(i);
    }
    return temp;
  }
  static int[] nextSmallerIndex(int[] arr, int n){
    int[] temp = new int[n];
    Stack<Integer> stack = new Stack<>();
    temp[n-1] = n;
    stack.push(n-1);
    for (int i = n-2;i >= 0 ;i--) {
      while(!stack.isEmpty() && arr[stack.peek()] >= arr[i]){
        stack.pop();
      }
      int ns = stack.isEmpty() ? 7 : stack.peek();
      temp[i] = ns;
      stack.push(i);
    }
    return temp;
  }
  static int longestRectangularAreaInAHistogram(int[] arr,int n){
    int res = 0;
    int[] ps = prevSmallerIndex(arr,n);
    int[] ns = nextSmallerIndex(arr,n);
    for (int i = 0;i < n ;i++ ) {
      int curr = arr[i];
      curr+=  (i-ps[i]-1)*arr[i];
      curr+=  (ns[i]-1-i)*arr[i];
      res = Math.max(res,curr);
    }
    return res;
  }
}
