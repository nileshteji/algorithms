import java.util.ArrayList;
import java.util.Arrays;

class Graph {
    int vertices;
    ArrayList<ArrayList<Integer>> adj;

    public Graph(int vertices) {
        this.vertices = vertices;
        adj = new ArrayList<>();
        for (int i = 0; i < vertices; i++) {
            adj.add(new ArrayList<>());
        }
    }

    public void addEdge(int src, int destination) {
        adj.get(src).add(destination);
    }

}

// we can use simple dfs if we get the visited node again then it means it is a
// cyclic graph

// in this we also need to find the backEdge which mean is there any connection
// of the current vertex to the other vertex
// which mean it can be used using discovery time
// or simply a parent array i am stupid
// this is simply a fucking douche program 

class Solution {
    public static void main(String[] args) {

        Graph g = new Graph(4);
        g.addEdge(0, 1);
        g.addEdge(1, 0);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);
        boolean[] visited = new boolean[g.vertices];
        int[] parent = new int[g.vertices];
        Arrays.fill(visited, false);
        Arrays.fill(parent, -1);

        visited[0] = true;
        DFS(g, 0, visited, parent);

    }

    static void DFS(Graph g, int src, boolean[] visited, int[] parent) {

        visited[src] = true;
        ArrayList<Integer> list = g.adj.get(src);
        for (int i : list) {

            if (!visited[i]) {
                parent[i] = src;
                DFS(g, i, visited, parent);
            } else {
                if (parent[src] == i) {
                    System.out.println("Cycle Detected between"+src+" "+i);
                    break;
                }
            }

        }

    }
}