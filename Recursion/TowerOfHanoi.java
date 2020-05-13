package SummerTrainingGFG.Recursion;

public class TowerOfHanoi {
    static void tower(int n,char a,char b,char c){
        if (n == 1){
            System.out.println("Move disk 1 from "+a+" to "+c);
            return;
        }
        tower(n-1,'A','C','B');
        System.out.println("Move disk "+n+" from "+a+" to "+c);
        tower(n-1,'A','C','B');
    }
    public static void main(String[] args) {
        tower(2,'A','B','C');
    }
}
