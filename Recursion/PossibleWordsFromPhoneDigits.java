package SummerTrainingGFG.Recursion;

public class PossibleWordsFromPhoneDigits {
    static void  possibleWords(int a[],int n){
        final String arr[] = {
                null,"","abc","def","ghi","jkl",
                "mno","pqrs","tuv","wxyz"
        };
        for (int i = 0; i < n; i++) {

        }
        possibleWords(a,n);
    }
    public static void main(String[] args) {
        possibleWords(new int[]{2,3,4},3);
        possibleWords(new int[]{3,4,5},3);

    }
}
