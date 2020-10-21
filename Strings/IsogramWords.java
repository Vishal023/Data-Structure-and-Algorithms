package SummerTrainingGFG.Strings;

import java.io.IOException;

/**
 * @author Vishal Singh
 */
public class IsogramWords {
    static void checkIsogramWords(String s){
        int[] arr = new int[256];
        int n = s.length();
        for (int i = 0; i < n; i++) {
            arr[s.charAt(i)]++;
        }
        for (int i = 0; i < 256; i++) {
            if (arr[i]>1){
                System.out.println("No it is not an Isogram");
                return;
            }
        }
        System.out.println("Yes it is an Isogram");
    }
    public static void main(String[] args)throws IOException {
        String s = "Isogram";
        checkIsogramWords(s);
    }
}
