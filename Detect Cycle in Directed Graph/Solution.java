import java.util.ArrayList;
import java.util.Arrays;

class Graph {
    int vertices;
    ArrayList<ArrayList<Integer>> adj;

    public Graph(int vertices) {
        this.vertices = vertices;
        for (int i = 0; i < vertices; i++) {
            adj = new ArrayList<>();
        }
    }

    public void addEdge(int src, int destination) {
        adj.get(src).add(destination);
    }

}

// we can use simple dfs if we get the visited node again then it means it is a
// cyclic graph
class Solution {
    public static void main(String[] args) {

    }
}