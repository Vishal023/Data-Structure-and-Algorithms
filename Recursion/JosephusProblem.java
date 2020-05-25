package SummerTrainingGFG.Recursion;
/**
 * @author Vishal Singh */
public class JosephusProblem {
    static int kill(int n, int k){
        if (n == 1){
            return 0;
        }
        return (kill(n-1,k)+k)%n;
    }
    public static void main(String[] args) {
        //System.out.println(kill(7,4)+1);
        System.out.println(kill(3,2));
    }
}
