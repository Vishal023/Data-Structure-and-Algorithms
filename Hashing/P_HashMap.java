package SummerTrainingGFG.Hashing;

import java.util.HashMap;

/**
 * @author Vishal Singh */
public class P_HashMap {
    public static void main(String[] args) {
        HashMap<String,Integer> m = new HashMap<>();
        m.put("First",1);
        m.put("Second",2);
        m.put("Third",3);
        System.out.println(m);
        System.out.println("Size: "+m.size());
        System.out.println(m.containsKey("First"));
        System.out.println(m.remove("First"));

    }
}
