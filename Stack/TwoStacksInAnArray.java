package SummerTrainingGFG.Stack;

import java.util.Stack;

/**
 * @author Vishal Singh
 */
public class TwoStacksInAnArray {
    static class TwoStack{
        int arr[];
        int capacity, top1, top2;
        TwoStack(int n){
            capacity = n;
            top1 = -1;
            top2 = n;
            arr = new int[n];
        }
        void push1(int x){
            if (top1 < top2-1){
                top1++;
                arr[top1] = x;
            }
        }
        void push2(int x){
            if (top1 < top2-1){
                top2--;
                arr[top2] = x;
            }
        }
        int pop1(){
            if (top1 >= 0){
                int x = arr[top1];
                top1--;
                return x;
            }else {
                return -1;
            }
        }
        int pop2(){
            if (top2 < capacity){
                int x = arr[top2];
                top2++;
                return x;
            }else {
                return -1;
            }
        }
    }
    public static void main(String[] args) {
        TwoStack twoStack = new TwoStack(7);
        twoStack.push1(1);
        twoStack.push1(2);
        twoStack.push1(3);
        twoStack.push1(4);

        twoStack.push2(40);
        twoStack.push2(455);

        for (int i = 0; i < 4; i++) {
            System.out.println(twoStack.pop1());
        }
        for (int i = 0; i < 2; i++) {
            System.out.println(twoStack.pop2());
        }


    }
}
