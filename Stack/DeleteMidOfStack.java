package SummerTrainingGFG.Stack;

import java.util.Stack;

/**
 * @author Vishal Singh
 */
public class DeleteMidOfStack {
    static Stack<Integer> deleteMid(Stack<Integer>s,int sizeOfStack,int current) {
        int mid = (int) Math.ceil(sizeOfStack/2.0);
        System.out.println(mid);
        if (s.isEmpty() || current == sizeOfStack){
            return s;
        }
        int x = s.pop();
        deleteMid(s,sizeOfStack,current+1);
        if (current != (sizeOfStack/2)){
            s.push(x);
        }
        return s;
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        System.out.println(deleteMid(s,s.size(),0));
    }
}
