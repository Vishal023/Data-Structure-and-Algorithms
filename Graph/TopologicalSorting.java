package SummerTrainingGFG.Graph;

import java.util.*;
import java.lang.*;
import java.io.*;

/**
 * @author Vishal Singh
 * 07-02-2021
 * Did you know extra semicolons are not error in java?
 */

;   ;  ;;;;;   ;;;;;   ;;  ;;  ;;;;;;  ;;
;   ;    ;     ;;      ;;  ;;  ;;  ;;  ;;
;   ;    ;     ;;;;;   ;;;;;;  ;;;;;;  ;;
 ; ;     ;        ;;   ;;  ;;  ;;  ;;  ;;
  ;    ;;;;;   ;;;;;   ;;  ;;  ;;  ;;  ;;;;;;;

public class TopologicalSorting {
    public static void addEdge(ArrayList<ArrayList<Integer>> graph, int s,int d){
        graph.get(s).add(d);
    }
    public static void topologicalSort(ArrayList<ArrayList<Integer>> graph,int v){
        int[] dependency = new int[v];
        for (ArrayList<Integer> integers : graph) {
            for (int d : integers) {
                dependency[d]++;
            }
        }
        Queue<Integer> q  = new ArrayDeque<>();
        for (int i = 0; i < v; i++) {
            if (dependency[i] == 0){
                q.add(i);
            }
        }
        while (!q.isEmpty()){
            int s = q.poll();
            System.out.print(s+" ");
            for (int d: graph.get(s)){
                dependency[d]--;
                if (dependency[d]==0){
                    q.add(d);
                }
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        int v = 5;
        for (int i = 0; i < v; i++) {
            graph.add(new ArrayList<>());
        }
        addEdge(graph,0,2);
        addEdge(graph,0,3);
        addEdge(graph,1,3);
        addEdge(graph,1,4);
        addEdge(graph,2,3);
        topologicalSort(graph,v);
    }
}