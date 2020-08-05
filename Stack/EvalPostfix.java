package SummerTrainingGFG.Stack;

import java.util.Stack;

/**
 * @author Vishal Singh
 */
public class EvalPostfix {
    static int calculate(char ch, int a, int b){
        if (ch == '/'){
            return a/b;
        }else if (ch == '*'){
            return a*b;
        }else if (ch == '+'){
            return a+b;
        }else{
            return a-b;
        }
    }
    static int evaluatePostFix(String exp){
        Stack<Integer> temp = new Stack<>();
        int eval = 0;
        for (int i = 0; i < exp.length(); i++) {
            char currChar = exp.charAt(i);
            // Not from these then -1
            if ("+-*/".indexOf(currChar) == -1){
                temp.push(Integer.parseInt(String.valueOf(exp.charAt(i))));
            }else {
                int first = temp.pop();
                int second =temp.pop();
                int res = calculate(currChar,second,first);
                temp.push(res);
            }
        }
        return temp.pop();
    }
    public static void main(String[] args) {
        String exp = "231*+9-";
        System.out.println(evaluatePostFix(exp));
    }
}