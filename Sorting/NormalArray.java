package SummerTrainingGFG.Sorting;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/**
 * @author Vishal Singh */
class Point{
    int xPoint,yPoint;
    Point(int xPoint,int yPoint){
        this.xPoint = xPoint;
        this.yPoint = yPoint;
    }
}
class MySort implements Comparator<Point>{
    public int compare(Point a,Point b){
        //sorts in increasing order of x
        return (a.xPoint-b.xPoint);
        /*
        Sorts in decreasing order of x
        return (b.x-a.x);
         */
    }
}

public class NormalArray {
    public static void main(String[] args) {
        int[] arr = {9,8,7,6,5,4,3,1,2};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        //Collection.reverseOrder() works only with wrapper class
        Integer[] arr1 = {9,8,7,6,5,4,3,1,2};
        Arrays.sort(arr1,Collections.reverseOrder());
        System.out.println(Arrays.toString(arr1));

        arr = new int[]{9,8,7,6,5,4,3,1,2};
        Arrays.sort(arr,1,3);
        System.out.println(Arrays.toString(arr));


        //Sorting Point which stores 2d points
        Point[] points = {
                new Point(10,20),
                new Point(3,12),
                new Point(5,7),
        };
        Arrays.sort(points,new MySort());
        for (Point point : points) {
            System.out.print("{"+point.xPoint + "," + point.yPoint+"}");
            System.out.print(" ");
        }
    }
}
