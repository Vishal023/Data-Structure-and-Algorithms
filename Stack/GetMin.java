package SummerTrainingGFG.Stack;

import java.io.*;
import java.util.*;

/*
* @author: Vishal Singh*/
public class GetMin{
    static class StackGetMin{
        Stack<Integer> main  = new Stack<>();
        Stack<Integer> aux  = new Stack<>();
        void push(int data){
            if (main.isEmpty()) {
                main.push(data);
                aux.push(data);
                System.out.println("Pushed "+data);
            }else {
                main.push(data);
                System.out.println("Pushed "+data);
            }
            if (aux.peek() >= main.peek()){
                aux.push(data);
            }
        }
        void pop(){
            if (main.peek().equals(aux.peek())) {
                aux.pop();
            }
            System.out.println("Popped "+main.pop());
        }
        void getMin(){
            System.out.println(aux.peek());
        }
    }
    public static void main(String[] args) {
        StackGetMin s = new StackGetMin();
        s.push(3);
        s.push(5);
        s.getMin();
        s.push(2);
        s.push(1);
        s.getMin();
        s.pop();
        s.getMin();
        s.pop();
    }
}
