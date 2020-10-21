package SummerTrainingGFG.Strings;

/**
 * @author Vishal Singh
 */
public class LeftMostRepeating {
    static int leftmostRepeating(String str,int n){
        int res = Integer.MAX_VALUE;
        int[] firstIndex = new int[256];
        for (int i = 0; i < 256; i++) {
            firstIndex[i] = -1;
        }
        for (int i = 0; i < n; i++) {
            if (firstIndex[str.charAt(i)] == -1){
                firstIndex[str.charAt(i)] = i;
            }
            else {
                res = Math.min(res,firstIndex[str.charAt(i)]);
            }
        }
        return res == Integer.MAX_VALUE ? -1 : res;
    }
    public static void main(String[] args) {
        String str = "1-malayalam";
        System.out.println(leftmostRepeating(str,str.length()));
    }
}
