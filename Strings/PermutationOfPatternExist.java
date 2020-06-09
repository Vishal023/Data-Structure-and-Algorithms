package SummerTrainingGFG.Strings;

import java.util.Arrays;

/**
 * @author Vishal Singh
 */
public class PermutationOfPatternExist {
    static boolean checkPattern(String string,String pattern){
        int n = string.length();
        int m = pattern.length();
        int[] countPattern = new int[256];
        int[] countString = new int[256];

        for (int i = 0; i < pattern.length(); i++) {
            countPattern[pattern.charAt(i)]++;
            countString[string.charAt(i)]++;
        }
        for (int i = m; i < n; i++) {
            if (Arrays.equals(countPattern,countString)){
                return true;
            }
            countString[string.charAt(i)]++;
            countString[string.charAt(i-m)]--;
        }
        return false;
    }
    public static void main(String[] args) {
        String s1 = "malayalam";
        String pattern = "yamal"; //malay
        System.out.println(checkPattern(s1,pattern));
    }
}
