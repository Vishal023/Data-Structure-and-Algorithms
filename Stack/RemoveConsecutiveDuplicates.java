package SummerTrainingGFG.Stack;

import java.util.Stack;

/**
 * @author Vishal Singh
 */
public class RemoveConsecutiveDuplicates {
    public static String removeConsecutiveDuplicates(String str){
        Stack<Character> st = new Stack<>();
        st.push(str.charAt(0));
        StringBuilder temp = new StringBuilder(str.charAt(0) + "");
        for(int i = 1; i < str.length(); i++){
            if(st.peek() != str.charAt(i)){
                st.push(str.charAt(i));
                temp.append(st.peek());
            }
        }
        return temp.toString();
    }

    public static void main(String[] args) {
        System.out.println(removeConsecutiveDuplicates("aaaaaabaabccccccc"));
    }
}
