package SummerTrainingGFG.Mathematics;
/**
 * @author Vishal Singh */

public class LastTermOfGP {
    public static void main(String[] args) {
        int n1 = 84;
        int n2 = 87;
        int n = 3;
        double r = (double)n2/(double)n1;
        System.out.println(n1*Math.pow(r,n-1));
    }
}
