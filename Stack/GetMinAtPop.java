package SummerTrainingGFG.Stack;

import java.util.Stack;

/**
 * @author Vishal Singh
 */
public class GetMinAtPop {
    public static Stack<Integer> _push(int arr[], int n)
    {
        Stack<Integer>s=new Stack<>();
        int min=arr[0];
        for(int i=0;i<n;i++){
            min=Math.min(min,arr[i]);
            s.push(min);
        }
        return s;
    }
    static void _getMinAtPop(Stack<Integer>s)
    {
        while(!s.empty())
            System.out.print(s.pop()+" ");
    }
    public static void main(String[] args) {
        Stack<Integer> s = _push(new int[]{1, 6, 43, 1, 2, 0, 5},7);
        _getMinAtPop(s);
    }
}
