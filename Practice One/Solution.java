import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class Graph {
    int v;
    List<List<Edge>> list;

    Graph(int vertices) {
        v = vertices;
        list = new ArrayList<>();

        for (int i = 0; i < vertices; i++) {
            list.add(new ArrayList<>());
        }

    }

    void addEdge(Edge edge) {
        list.get(edge.s).add(edge);
    }

}

class Edge {
    int sA, s, d, dA;

    Edge(int sA, int s, int d, int dA) {
        this.sA = sA;
        this.s = s - 1;
        this.d = d - 1;
        this.dA = dA;
    }

}

class Solution {
    static int MAX = Integer.MIN_VALUE;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int len = scan.nextInt();

        String a = scan.next();
        int[] X = new int[len];
        int[] Y = new int[len];
        int[] A = new int[256];
        Arrays.fill(A, 0);

        for (int i = 0; i < len; i++) {
            X[i] = scan.nextInt();
        }
        for (int i = 0; i < len; i++) {
            Y[i] = scan.nextInt();
        }

        Graph g = new Graph(n);
        for (int i = 0; i < len; i++) {
            g.addEdge(new Edge((int) a.charAt(X[i] - 1), X[i], Y[i], (int) a.charAt(Y[i] - 1)));
        }

        boolean[] visited = new boolean[n];
        Arrays.fill(visited, false);
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                DFS(g, A, visited, i);
            }
        }
        System.out.println(MAX);

    }

    static void DFS(Graph g, int[] A, boolean[] visited, int src) {

        visited[src] = true;

        for (Edge e : g.list.get(src)) {
            A[(e.sA) - 1] += 1;
            A[(e.dA) - 1] += 1;
            if (!visited[e.d]) {
                DFS(g, A, visited, e.d);
                maxium(A);
            }

        }

    }

    static void maxium(int[] A) {
        for (int i : A) {
            MAX = Math.max(MAX, i);
        }
        Arrays.fill(A, 0);
    }
}
