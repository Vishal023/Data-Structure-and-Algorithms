package SummerTrainingGFG.Implementation;

import java.util.LinkedList;
/**
 * @author Vishal Singh */

public class P_LinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> li = new LinkedList<Integer>();
        for (int i = 0; i < 4 ; i++) {
            li.add(i+777);
        }
        for (int i = 0; i < 4; i++) {
            System.out.println(li.get(i));
        }
    }
}
