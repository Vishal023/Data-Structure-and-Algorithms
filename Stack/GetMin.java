import java.io.*;
import java.util.*;

/*
* @author: Vishal Singh*/

/*
public class GetMin{
  public static void main(String[] args) {
    Stack s = new Stack(3);
    s.push(5);
    s.push(4);
    s.push(3);
    s.print();
    s.push(31);
    System.out.println(s.pop());
    System.out.println(s.pop());
    System.out.println(s.pop());
    System.out.println(s.pop());
    s.push(1);
    s.print();
  }
  static class Stack{
      private final int size;
      private final int[] arr;
      private int top;
      private int getMin = Integer.MaxValue;
      Stack(int size){
          this.size = size;
          arr = new int[size];
          top = -1;
      }
      void push(int data){
          if(top == size){
              System.out.println("Overflow");
          }
          else{
              getMin = Math.min(getMin,data);
              arr[top] = data;
              top++;
          }
      }
      int pop(){
          if(top == 0){
              getMin = Integer.MaxValue;
              System.out.println("Underflow");
              return -1;
          }
          else{
              getMin = Math.min(getMin,data);
              int res = arr[top-1];
              top--;
              return res;
          }
      }
      int getMinValue(){
        if (getMin == Integer.MaxValue) {
          System.out.println("Push an element");
        }else{
          System.out.println(getMin);
        }
      }
      void print(){
          if(top == -1) {
              System.out.println("No element present");
          }
          else{
              for (int i = 0; i < top; i++) {
                  System.out.print(arr[i]+" ");
              }
              System.out.println("");
          }
      }
  }
}
*/
