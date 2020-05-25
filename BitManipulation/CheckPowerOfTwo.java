package SummerTrainingGFG.BitManipulation;
/**
 * @author Vishal Singh */

public class CheckPowerOfTwo {
    public static void main(String[] args) {
        int num = 15;
        int num1 = 16;
        System.out.println( (num & (num-1)) == 0);
        System.out.println( (num1 &(num1-1)) == 0);
    }
}
