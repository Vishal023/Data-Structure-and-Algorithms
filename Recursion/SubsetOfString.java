package SummerTrainingGFG.Recursion;

public class SubsetOfString {
    static void subset(String str, String curr, int index){
        if (index == str.length()){
            System.out.println(curr);
            return;
        }
        subset(str,curr,index+1);
        subset(str,curr+str.charAt(index),index+1);
    }
    public static void main(String[] args) {
        int index = 0;
        String curr = "";
        String string = "ABC";
        subset(string,curr,index);
    }
}
