package SummerTrainingGFG.Strings;

/**
 * @author Vishal Singh
 */
public class RotationOfStringOrNot {
    static boolean checkRotation(String s1,String s2){
        if (s1.length() != s2.length()){
            return false;
        }
        s1 += s1;
        return s1.contains(s2); // s1.indexOf(s2)>=0
    }
    public static void main(String[] args) {
        String str1 = "ABCD";
        String str2 = "CDAB";
        System.out.println(checkRotation(str1,str2));
    }
}
