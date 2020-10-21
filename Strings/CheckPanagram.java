package SummerTrainingGFG.Strings;

/**
 * @author Vishal Singh
 */
public class CheckPanagram {
    static boolean checkPan(String str){
        str = str.toLowerCase();
        int[] arr = new int[256];
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            arr[str.charAt(i)]++;
            sum+= arr[str.charAt(i)];
        }
        for (int i = 97; i <= 122; i++) {
            if (!(arr[i] >0)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String str = "The quick brown fox jumps over the lazy dog";
        System.out.println(checkPan(str));
    }
}
