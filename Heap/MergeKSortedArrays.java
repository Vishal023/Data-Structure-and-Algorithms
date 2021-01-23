package SummerTrainingGFG.Heap;

import CompetitvePractive450Set.Array;
import kotlin.Triple;
import org.jetbrains.annotations.NotNull;

import java.util.*;
import java.lang.*;
import java.io.*;

/**
 * @author Vishal Singh
 * 17-01-2021
 */

public class MergeKSortedArrays {
    static class Triplet implements Comparable<Triplet> {
        int value;
        int j;
        int i;
        /**
         * @param value - value of the element
         * @param i     - pos of value in all arrays
         * @param j     - pos of value in its own array
         */
        Triplet(int value, int i, int j) {
            this.value = value;
            this.i = i;
            this.j = j;
        }

        @Override
        public String toString() {
            return "Triplet{ " +
                    "value=" + value +
                    ", j=" + j +
                    ", i=" + i +
                    " }";
        }

        @Override
        public int compareTo(Triplet triplet) {
            return value - triplet.value;
        }
    }

    public static void mergeKSortedArrays(ArrayList<List<Integer>> list, int size) {
        PriorityQueue<Triplet> pq = new PriorityQueue<>();
        /*
        * intitally put first elements of all the array in Min Heap*/
        for (int i = 0; i < list.size(); i++) {
            pq.add( new Triplet(list.get(i).get(0),i,0));
        }
        List<Integer> ans = new ArrayList<>();
        while (!pq.isEmpty()){
            Triplet temp = pq.poll();
            ans.add(temp.value);
            int arrayPos = temp.i;
            int valuePos = temp.j;
            if (valuePos+1 < list.get(arrayPos).size()){
                pq.add(
                        new Triplet(
                                list.get(arrayPos).get(valuePos+1),
                                arrayPos,
                                valuePos+1
                        )
                );
            }
        }
        System.out.println("Sorted Array : "+ ans);
    }

    public static void main(String[] args) {
        ArrayList<List<Integer>> list = new ArrayList<>();
        list.add(Arrays.asList(10, 20, 30));
        list.add(Arrays.asList(5, 15));
        list.add(Arrays.asList(1, 9, 11, 18));
        mergeKSortedArrays(list, list.size());
    }
}