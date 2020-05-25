package SummerTrainingGFG.Miscellaneous;
/**
 * @author Vishal Singh */

public class NaturalNumbers {
    static int sum(int n){
        if (n==1)
            return 1;
        return n+sum(n-1);
    }
    static int formulaSum(int n){
        return (n*(n+1))/2;
    }
    public static void main(String[] args) {
        int n = 3;
        System.out.println(sum(n));
        System.out.println(formulaSum(n));
    }
}
