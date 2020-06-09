package SummerTrainingGFG.Strings;

/**
 * @author Vishal Singh
 */
public class SumOfNumberInString {
    public static void main(String[] args) {
        String s = "1abc2x30yz67";
        String regex = "[a-zA-Z]";
        String[] arr = s.split(regex);
        long sum = 0;
        for (String value : arr) {
            if (!value.isEmpty())
            sum += Long.parseLong(value);
        }
        System.out.println(sum);
    }
}
