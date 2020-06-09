package SummerTrainingGFG.Strings;

/**
 * @author Vishal Singh
 * Reference - Geeks for geeks
 */
public class LexicographicRankProblem {
    static int fact(int i){
        if (i == 0 || i == 1){
            return 1;
        }
        int fact = 1;
        for (int j = 2; j <= i; j++) {
            fact = fact*j;
        }
        return fact;
    }
    static int lexRank(String str){
        int n = str.length();
        int mul = fact(n);
        int rank = 1;
        int[] count = new int[256];
        for (int i = 0; i < n; i++) {
            count[str.charAt(i)]++;
        }
        for (int i = 1; i < 256; i++) {
            count[i] += count[i-1];
        }
        for (int i = 0; i < n; i++) {
            mul = mul/(n-i);
            rank += (count[str.charAt(i)-1]*mul);
            for (int j = str.charAt(i); j < 256; j++) {
                count[j]--;
            }
        }
        return rank;
    }
    public static void main(String[] args) {
        String str = "string";
        System.out.println("Lex Rank of "+str+" is : "+lexRank(str));
    }
}
