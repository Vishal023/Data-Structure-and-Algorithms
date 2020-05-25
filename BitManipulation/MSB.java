package SummerTrainingGFG.BitManipulation;
/**
 * @author Vishal Singh */

public class MSB{
    public static void main(String[] args) {
        int n = 10;
        int temp = 0;
        while ((n>>=1) != 0){
            temp++;
        }
        System.out.println("MSB is: "+Math.pow(2,temp));
    }
}
