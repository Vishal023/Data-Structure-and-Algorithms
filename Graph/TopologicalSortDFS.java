package SummerTrainingGFG.Graph;

import java.util.*;
import java.lang.*;
import java.io.*;

/**
 * @author Vishal Singh
 * 07-02-2021
 */
public class TopologicalSortDFS {
    public static void addEdge(ArrayList<ArrayList<Integer>> graph,int s,int d){
        graph.get(s).add(d);
    }
    public static void topologicalSort(ArrayList<ArrayList<Integer>> graph, int v){
        boolean[] visited = new boolean[v];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < v; i++) {
            if (!visited[i]){
                dfs(graph,visited,stack,i);
            }
        }
        while (!stack.isEmpty()){
            System.out.print(stack.pop()+" ");
        }
        System.out.println();
    }
    public static void dfs(ArrayList<ArrayList<Integer>> graph,boolean[] visited,Stack<Integer> stack,int source){
        visited[source] = true;
        for (int d: graph.get(source)){
            if (!visited[d]){
                dfs(graph,visited,stack,d);
            }
        }
        stack.push(source);
    }
    public static void main(String[] args){
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        int v = 5;
        for (int i = 0; i < v; i++) {
            graph.add(new ArrayList<>());
        }
        addEdge(graph,0,1);
        addEdge(graph,1,3);
        addEdge(graph,3,4);
        addEdge(graph,2,3);
        addEdge(graph,2,4);
        topologicalSort(graph,v);
    }
}