package SummerTrainingGFG.BitManipulation;
/**
 * @author Vishal Singh */

public class ToggleBits {
    public static void main(String[] args) {
        int num= 5;
        int toggle1st = 2;
        int r = 1 << (toggle1st-1);
        System.out.println(num^r);
    }
}
