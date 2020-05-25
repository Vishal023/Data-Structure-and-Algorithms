package SummerTrainingGFG.Miscellaneous;

//User function Template for Java
/**
 * @author Vishal Singh */

public class QuadraticEquation
{
    public static void quadraticRoots(int a,int b,int c)
    {
        //Your code here
        int d = (int) Math.floor(Math.pow(b,2)-(4*a*c));
        if(d < 0){
            System.out.print("Imaginary");
        }
        else {
            double root2 = (-b + Math.sqrt(d)) / (2 * a);
            if(d == 0){
                int r1 = (int) Math.floor(root2);
                System.out.print(r1+" "+r1);
            }
            else{
                int r1 = (int) Math.floor((-b-Math.sqrt(d))/(2*a));
                int r2 = (int) Math.floor(root2);
                if(r1>r2){
                    System.out.print(r1+" "+r2);
                }
                else if(r2>r1){
                    System.out.print(r2+" "+r1);
                }
                else{
                    System.out.print(r1+" "+r2);
                }
            }
        }
    }

    public static void main(String[] args) {
        quadraticRoots(1,-2,1);
        quadraticRoots(1,-7,12);
        quadraticRoots(1,4,8);
        quadraticRoots(752,904,164);
    }
}

