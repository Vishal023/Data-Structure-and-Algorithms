package SummerTrainingGFG.Stack;

import java.util.Stack;

/**
 * @author Vishal Singh
 */
public class InfixToPostfix {
    static int precedence(char a){
        switch (a){
            case '^':
                return 5;
            case '/':
            case '*':
                return 4;
            case '+':
            case '-':
                return 3;
        }
        return -1;
    }
    static String infixToPostfix(String exp) {
        Stack<Character> stack = new Stack<>();
        stack.push('(');
        exp = exp+")";
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < exp.length(); i++) {
            char currChar = exp.charAt(i);
           // System.out.println(stack);
            if (("^*/+-()").indexOf(currChar) == -1) {
                sb.append(exp.charAt(i));
               // System.out.println(sb);
            }else {
                if (stack.isEmpty()){
                    stack.push(currChar);
                }else{
                    if (currChar == ')'){
                        while (stack.peek() != '('){
                            sb.append(stack.pop());
                            //System.out.println(sb);
                        }
                        stack.pop();
                    }else {
                        if (currChar == '('){
                            stack.push('(');
                        }
                        else {
                            while (true){
                                if (precedence(currChar) <= precedence(stack.peek())){
                                    sb.append(stack.pop());
                                    //System.out.println(sb);
                                }else {
                                    stack.push(currChar);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        //System.out.println(stack);
        return sb.toString();
    }
    public static void main(String[] args) {
        String exp = "a+b*(c^d-e)^(f+g*h)-i";
        System.out.println(infixToPostfix(exp));
    }
}
