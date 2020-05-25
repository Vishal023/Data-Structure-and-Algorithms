package SummerTrainingGFG.Mathematics;
/**
 * @author Vishal Singh */

public class PrimeNumber {
    static boolean isPrime(int n){
        if (n<=1){
            return false;
        }
        if (n<=3){
            return true;
        }
        if (n%2 == 0 || n%3 ==0){
            return false;
        }
        for (int i = 5; i*i <= n ; i=i+6) {
            if (n%i == 0 || n%(i+2) == 0){
                return false;
            }
        }
        return true;
        /*if(n<=1){
            return false;
        }
        if(n<=3){
            return true;
        }
        if (n%2 == 0 || n%3 ==0){
            return false;
        }
        int  res = 0;
        while (Math.sqrt(n)>0){
            res += (n&1);
            n = n>>1;
        }
        if(res == 2 || res == 3){
            return true;
        }
        return false;*/
    }
    public static void main(String[] args) {
        for (int i = 0; i < 50 ; i++) {
            if (isPrime(i)){
                System.out.println(i+". "+Integer.toBinaryString(i));
            }
        }
    }
}
