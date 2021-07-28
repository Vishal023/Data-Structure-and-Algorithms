package SummerTrainingGFG.Graph;

import java.util.ArrayList;

/**
 * @author Vishal Singh
 * 07-02-2021
 */

public class DetectCycleDirected {
    public static void addEdge(ArrayList<ArrayList<Integer>> graph,int s,int d ){
        graph.get(s).add(d);
    }
    public static void detectCycle(ArrayList<ArrayList<Integer>> graph,int v){
        boolean[] vis = new boolean[v];
        boolean[] recStack = new boolean[v];
        boolean isCycle = false;
        for (int i = 0; i < v; i++) {
            if (!vis[i]){
                if (dfs(graph,vis,recStack,i)){
                    System.out.println("Cycle");
                    isCycle = true;
                }
            }
        }
        if (!isCycle){
            System.out.println("No cycle");
        }
    }
    public static boolean dfs(ArrayList<ArrayList<Integer>> graph,boolean[] vis,boolean[] recStack,int s){
        vis[s] = true;
        recStack[s] = true;
        for (int d: graph.get(s)){
            if (!vis[d]){
                if (dfs(graph,vis,recStack,d)){
                    return true;
                }
            }else if (recStack[d]){
                return true;
            }
        }
        recStack[s] = false;
        return false;
    }
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        int v = 6;
        for (int i = 0; i < v; i++) {
            graph.add(new ArrayList<>());
        }
        addEdge(graph,0,1);
        addEdge(graph,2,1);
        addEdge(graph,2,3);
        addEdge(graph,3,4);
        addEdge(graph,4,5);
        addEdge(graph,5,3);
        System.out.println(graph);
        detectCycle(graph,v);
    }
}