package SummerTrainingGFG.Hashing;

import java.util.HashSet;
import java.util.Iterator;

/**
 * @author Vishal Singh */
public class P_HashSet {
    public static void main(String[] args) {
        HashSet<String> h = new HashSet<String>();
        h.add("Hello");
        h.add("I am");
        h.add("Hashing");
        System.out.println(h);
        System.out.println(h.contains("Hello"));

        Iterator<String> i = h.iterator();
        while (i.hasNext()){
            System.out.print(i.next()+" ");
        }
        h.remove("I am");
        System.out.println("\nSize: "+h.size());
        for (String s:
             h) {
            System.out.println(s);
        }
        System.out.println("Is empty: "+h.isEmpty());
    }
}
