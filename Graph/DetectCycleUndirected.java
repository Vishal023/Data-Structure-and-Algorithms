package SummerTrainingGFG.Graph;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * @author Vishal Singh
 * 06-02-2021
 */

public class DetectCycleUndirected {
    private static void addEdge(ArrayList<LinkedList<Integer>> graph,int u,int v){
        graph.get(u).add(v);
        graph.get(v).add(u);
    }
    private static boolean dfs(ArrayList<LinkedList<Integer>> graph,int s,boolean[] visited,int parent){
        visited[s] = true;
        for (int v: graph.get(s)){
            if (!visited[v]){
                if (dfs(graph,v,visited,s)){
                    return true;
                }
            }else if (v!=parent){
                return true;
            }
        }
        return false;
    }
    private static void detectCycle(ArrayList<LinkedList<Integer>> graph,int v){
        /* Modified DFS */
        boolean[] visited = new boolean[v];
        boolean isCycle = false;
        for (int i = 0; i < v; i++) {
            if (!visited[i]){
                if (dfs(graph,i,visited,-1)){
                    System.out.println("Cycle Present");
                    isCycle = true;
                    break;
                }
            }
        }
        if (!isCycle){
            System.out.println("No cycle present");
        }
    }
    public static void main(String[] args) {
        ArrayList<LinkedList<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            graph.add(new LinkedList<>());
        }
        addEdge(graph,0,1);
        addEdge(graph,1,2);
        addEdge(graph,2,3);
        addEdge(graph,0,2);
        detectCycle(graph,4);
    }
}