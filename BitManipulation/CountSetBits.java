package SummerTrainingGFG.BitManipulation;
/**
 * @author Vishal Singh */

public class CountSetBits {
    /*
    * n = 5
    * binary = 1 0 1
    * in 32 bits 000000.......0101
    * */
    public static void main(String[] args) {
        int n = 17;
        int res = 0;
        while (n>0){
            if (n%2 != 0) {
                res++;
            }
            n = n/2;
        }
        System.out.println(res);
        n = 5;
        res = 0;
        while (n>0){
            if ((n&1) == 0) {
                res++;
            }
            n = n>>1;
        }
        n = 5;
        res = 0;
        while (n>0){
            res += (n&1);
            n = n>>1;
        }
    }
}
