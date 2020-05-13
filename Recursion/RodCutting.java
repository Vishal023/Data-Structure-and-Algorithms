package SummerTrainingGFG.Recursion;

public class RodCutting {
    static int maxCuts(int n,int a,int b,int c){

        if (n==0){
            return 0;
        }
        if (n<0){
            return -1;
        }
        int path1 = maxCuts(n-a, a, b, c);
        int path2 = maxCuts(n-b, a, b, c);
        int path3 = maxCuts(n-c, a, b, c);
        int result = Math.max(Math.max(path1,path2),path3);
        if (result<0){
            return -1;
        }
        return result+1;
    }

    public static void main(String[] args) {
        System.out.println(maxCuts(5,2,1,5));
    }
}
