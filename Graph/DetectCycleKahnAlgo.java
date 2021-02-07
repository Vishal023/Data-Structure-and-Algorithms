package SummerTrainingGFG.Graph;

import java.util.*;
import java.lang.*;
import java.io.*;
/**
 * @author Vishal Singh
 * 07-02-2021 */

public class DetectCycleKahnAlgo {
    public static void addEdge(ArrayList<ArrayList<Integer>> graph, int s,int d){
        graph.get(s).add(d);
    }
    public static void detectCycle(ArrayList<ArrayList<Integer>> graph,int v){
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
        int count = 0;
        while (!q.isEmpty()){
            int s = q.poll();
            count++;
            for (int d: graph.get(s)){
                dependency[d]--;
                if (dependency[d]==0){
                    q.add(d);
                }
            }
        }
        if (count!=v){
            System.out.println("Cycle");
        }else {
            System.out.println("No cycle");
        }
    }
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        int v = 5;
        for (int i = 0; i < v; i++) {
            graph.add(new ArrayList<>());
        }
        addEdge(graph,0, 1);
        addEdge(graph,4, 1);
        addEdge(graph,1, 2);
        addEdge(graph,2, 3);
        addEdge(graph,3, 1);

        detectCycle(graph,v);
    }
}