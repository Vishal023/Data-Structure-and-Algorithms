package SummerTrainingGFG.Stack;

import java.util.Stack;

/**
 * @author Vishal Singh
 */
public class RemoveConsecutiveDuplicates2 {
    public static String removePair(String str){
        Stack<Character> st = new Stack<>();
        st.push(str.charAt(0));
        StringBuilder sb = new StringBuilder("");
        for (int i = 1; i < str.length(); i++) {
            if (!st.isEmpty() && st.peek() == str.charAt(i)){
                st.pop();
            }else {
                st.push(str.charAt(i));
            }
        }
        for (Character ch :
                st) {
            sb.append(ch);
        }
        return st.isEmpty() ? "Empty String" : sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(removePair("aaabbaaccd"));
    }
}
