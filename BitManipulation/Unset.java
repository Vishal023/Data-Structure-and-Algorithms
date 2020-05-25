package SummerTrainingGFG.BitManipulation;
/**
 * @author Vishal Singh */

public class Unset {
    public static void main(String[] args) {
        int num= 5;
        int unSet3rdBit = 3;
        int r = 1 <<  (unSet3rdBit-1);
        r = ~r;
        System.out.println(num&r);
    }
}
