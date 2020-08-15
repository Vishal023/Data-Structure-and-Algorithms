package SummerTrainingGFG.Queue;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * @author Vishal Singh
 */

class Stack{
    Queue<Integer> q1 = new ArrayDeque<>();
    Queue<Integer> q2 = new ArrayDeque<>();
    int top(){
        if (q1.isEmpty()){
            return -1;
        }
        return q1.peek();
    }
    int size(){
        return q1.size();
    }
    int pop(){
        if (q1.isEmpty()){
            return -1;
        }
        return q1.poll();
    }
    void push(int data){
        while(!q1.isEmpty()){
            q2.offer(q1.peek());
            q1.poll();
        }
        q1.offer(data);
        while (!q2.isEmpty()){
            q1.offer(q2.peek());
            q2.poll();
        }
    }
}

public class StackUsingQueue {
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println("current size: " + s.size());
        System.out.println(s.top());
        s.pop();
        System.out.println(s.top());
        s.pop();
        System.out.println(s.top());

        System.out.println("current size: " + s.size());
    }
}
