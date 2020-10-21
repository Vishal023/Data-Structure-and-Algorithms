package SummerTrainingGFG.Sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * @author Vishal Singh */

class Point1{
    int xPoint,yPoint;
    Point1(int xPoint,int yPoint){
        this.xPoint = xPoint;
        this.yPoint = yPoint;
    }
}
class MySort1 implements Comparator<Point> {
    public int compare(Point a,Point b){
        //sorts in increasing order of x
        return (a.xPoint-b.xPoint);
        /*
        Sorts in decreasing order of x
        return (b.x-a.x);
         */
        /*
        Sorts acc to y
        return (a.y-b.y);
        */
    }
}

public class ListTypeArray {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(5);
        arrayList.add(1);
        arrayList.add(27);
        Collections.sort(arrayList);
        System.out.println(arrayList);

        Collections.sort(arrayList,Collections.reverseOrder()); // Implements Tim sort (Insertion + Merge)Sort
        //Can also be written as -> arrayList.sort(Collections.reverseOrder());
        System.out.println(arrayList);

        ArrayList<Point> arrayList1 = new ArrayList<>();
        arrayList1.add(new Point(10,20));
        arrayList1.add(new Point(3,12));
        arrayList1.add(new Point(5,7));

        Collections.sort(arrayList1,new MySort1());
        for (Point p:
             arrayList1) {
            System.out.print("{"+p.xPoint+" "+p.yPoint+"} ");
        }

    }
}
