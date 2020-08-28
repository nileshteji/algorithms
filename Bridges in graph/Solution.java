import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;

class Graph {
    int data;
    ArrayList<ArrayList<Integer>> adj;

    public Graph(int data) {
        this.data = data;
        adj=new ArrayList<>();
        for (int i = 0; i < data; i++) {
            adj.add(new ArrayList<>());

        }
    }

    void addEdge(int src, int destination) {
        adj.get(src).add(destination);
        adj.get(destination).add(src);
    }

}

public class Solution {
    static int time = 0;

    public static void main(String[] args) {
        Graph g1 = new Graph(5);
        g1.addEdge(1, 0);
        g1.addEdge(0, 2);
        g1.addEdge(2, 1);
        g1.addEdge(0, 3);
        g1.addEdge(3, 4);
        apt(g1);
    }

    static void apt(Graph graph) {
        boolean[] visited = new boolean[graph.data];
        boolean[] ap = new boolean[graph.data];
        int[] parent = new int[graph.data];
        int[] disc = new int[graph.data];
        int[] low = new int[graph.data];

        Arrays.fill(visited, false);
        Arrays.fill(ap, false);
        Arrays.fill(parent, -1);

        for (int i = 0; i < graph.data; i++) {
            if (!visited[i]) {
                Apt(i, disc, low, visited, ap, parent, graph);
            }
        }
        for (int i = 0; i < graph.data; i++) {
            if (ap[i] == true) {
                System.out.println(i);
            }
        }
    }

    static void Apt(int i, int[] disc, int[] low, boolean[] visited, boolean[] ap, int[] parent, Graph g1) {

        visited[i] = true;
        int children = 0;
        disc[i] = low[i] = ++time;
        List<Integer> list = g1.adj.get(i);
                                                                    
        Iterator<Integer> listIterator = list.iterator();
        while (listIterator.hasNext()) {
            int v = listIterator.next();
            if (!visited[v]) {
                children++;
                parent[v] = i;
                Apt(v, disc, low, visited, ap, parent, g1);

                low[i] = Math.min(low[i], low[v]);

                if (parent[i] == -1 && children > 1) {
                    ap[i] = true;
                }

                if (parent[i] != -1 && disc[i] <= low[v])
                    ap[i] = true;

            } else if (parent[v] != i) {
                low[i] = Math.min(low[i], disc[v]);
            }
        }

    }

}