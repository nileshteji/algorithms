import java.util.Arrays;

public class Solution {
    static final int V = 4;
    static int colors[] = new int[V];

    static boolean isSafe(int[][] graph, int v, int c) {

        for (int i = 0; i < V; i++) {
            if (graph[v][i] == 1 && colors[i] == c) {
                return false;
            }
        }

        return true;
    }

    static boolean graphColoringUtility(int[][] graph, int v, int m) {
        
        // This is the base case in which we have backtracked the 
        // Graph and now it is done to do this thing
        if(v==V){
              for(int i :colors){
                System.out.println(i);
              }

              return true;
          }


        // We iterate over the different colors
        for (int i = 0; i <3; i++) {
            if (isSafe(graph, v, i)) {
                colors[v] = i;

                if (graphColoringUtility(graph, v + 1, m)) {
                    return true;
                } 
                else {
                    colors[v] = 0;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Arrays.fill(colors, 0);
        int graph[][] = { 
            { 0, 1, 1, 1 }, 
            { 1, 0, 1, 0 },
             { 1, 1, 0, 1 }, 
             { 1, 0, 1, 0 }, 
            };
        // this no of colors
        int m = 2;
        if(graphColoringUtility(graph, 0, m)){

        }
        else{
            System.out.println("No a Bipartite Graph");
        }
    }
}