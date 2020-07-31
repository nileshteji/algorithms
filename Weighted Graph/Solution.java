import java.beans.DesignMode;
import java.util.ArrayList;
import java.util.Arrays;
class Edge{
int destination;
int weight;
    Edge(int destination,int weight){
        this.destination=destination;
        this.weight=weight;
    }

}
class Graph {
    int vertices;
    ArrayList<ArrayList<Edge>> adj;

    Graph(int vertices) {
        this.vertices = vertices;
        adj = new ArrayList<>();
        for (int i = 0; i <= vertices; i++) {
            adj.add(new ArrayList<>());
        }
    }

    void addEdge(int source, int destination, int weight) {
     adj.get(source).add(new Edge(destination,weight));

    }
}

class Solution {


    static void DFS(int source,boolean[] visited,Graph graph){
        visited[source]=true;
        System.out.print(source);

        ArrayList<Edge> adj=graph.adj.get(source);


        for(Edge edge : adj){
            if(!visited[edge.destination]){
                  DFS(edge.destination, visited, graph);
            }
        }


        

    }

    static void DFSUtil(Graph graph){
         boolean[] visited=new boolean[graph.vertices];
         Arrays.fill(visited, false);

        for(int i =0;i < graph.vertices;i++){
            if(!visited[i]){
            DFS(i,visited,graph);
            
          }
        }

    
    }




    // weighted graph implementation
    public static void main(String[] args) {
        // Since we use
        Graph graph=new Graph(4);
        graph.addEdge(0,1,10);
        graph.addEdge(0, 2, 15);
        graph.addEdge(1,2,16);
        graph.addEdge(2, 3, 20);
        graph.addEdge(3, 1, 35);
        DFSUtil(graph);

    }

}