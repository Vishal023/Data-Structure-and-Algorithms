package SummerTrainingGFG.Stack;
import java.util.*;
/**
 * @author Vishal Singh
 */
public class BalancedParenthesis {
   static boolean check(char a,char b){
        return (a=='{' && b == '}')||(a=='[' && b == ']')||(a=='(' && b == ')');
    }
    static boolean isBalancedParenthesis(String str){
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == '{' || str.charAt(i) == '[' || str.charAt(i) == '('){
                stack.push(str.charAt(i));
            }
            else{
                if(stack.isEmpty()){
                    return false;
                }
                else if(check(str.charAt(i),stack.peek())){
                    return false;
                }
                else{
                    stack.pop();
                }
            }
        }
        return stack.empty();
    }
    public static void main(String[] args) {
        String parenthesis = "{[([{}])]}"; // TRUE
        String parenthesis1 = "{[}]}"; // FALSE
        System.out.println(isBalancedParenthesis(parenthesis));
        System.out.println(isBalancedParenthesis(parenthesis1));
    }
}
