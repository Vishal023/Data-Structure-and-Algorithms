package SummerTrainingGFG.Hashing;

import java.util.HashMap;
import java.util.HashSet;

/**
 * @author Vishal Singh */
public class InsertionOfArray {
    static int intersectionArray(int[] a,int[] b,int aSize,int bSize){
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < aSize; i++) {
            set.add(a[i]);
        }
        int res = 0;
        for (int i = 0; i < bSize; i++) {
            if (set.contains(b[i])){
                res++;
                set.remove(b[i]);
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[] a =  {10,15,20,15,30,30,5};
        int[] b =  {30,5,30,80};
        System.out.println("Intersection array has - "+intersectionArray(a,b,a.length,b.length)+" elements");
    }
}
