package SummerTrainingGFG.Arrays;

import java.util.ArrayList;

public class ReverserArrayInGroup {
    public static ArrayList<Integer> reverseInGroups(ArrayList<Integer> mv, int n, int k) {
        for (int i = 0; i < n ; i=i+k) {

            int l = i;
            int r = Math.min(i + k - 1, n - 1);
            int temp;
            while (l<r){
                temp = mv.get(l);
                mv.set(l,mv.get(r));
                mv.set(r,temp);
                l++;
                r--;
            }
        }
        return mv;
    }
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(6);
        System.out.println(reverseInGroups(arrayList,arrayList.size(),3));
    }
}
