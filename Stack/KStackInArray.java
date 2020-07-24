package SummerTrainingGFG.Stack;

/**
 * @author Vishal Singh
 */
public class KStackInArray {
    static class KStack{
        int[] arr;
        int[] top;
        int[] next;
        int k, capacity, freeTop;
        KStack(int k1, int n){
            k = k1;
            capacity = n;
            arr = new int[capacity];
            top = new int[k];
            next = new int[capacity];
            freeTop = 0;
            for (int i = 0; i < capacity-1; i++) {
                next[i] = i+1;
            }
            next[capacity-1] = -1;
        }
        void push(int x, int stackNumber){
            int i = freeTop;
            freeTop = next[i];
            next[i] = top[stackNumber];
            top[stackNumber] = i;
            arr[i] = x;
        }
        int pop(int stackNumber){
            int i = top[stackNumber];
            top[stackNumber] = next[i];
            next[i] = freeTop;
            freeTop = i;
            return arr[i];
        }
    }
    public static void main(String[] args) {
        KStack kStack = new KStack(4,4);
        kStack.push(101,0);
        kStack.push(211,1);
        kStack.push(325,2);
        kStack.push(444,3);
        for (int i = 0; i < 4; i++) {
            System.out.println(kStack.pop(i));
        }
    }
}
