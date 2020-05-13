package SummerTrainingGFG.Miscellaneous;

import java.math.BigInteger;

public class FactorialDigits {
    static BigInteger fact(BigInteger num){
        if (num.compareTo(new BigInteger("0")) == 0){
            return BigInteger.ONE;
        }
        else if (num.compareTo(new BigInteger("1")) == 0){
            return BigInteger.ONE;
        }
        else {
            return num.multiply(fact(num.subtract(BigInteger.ONE)));

        }
    }
    public static void main(String[] args) {
        BigInteger res = fact(new BigInteger("120"));
        System.out.println((int)Math.floor(Math.log10(Double.parseDouble(String.valueOf(res)))+1));
    }
}
