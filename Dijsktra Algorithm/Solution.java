import java.beans.DesignMode;
import java.util.ArrayList;
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

    static void printGraph(Graph graph){

        for(int i =0;i<=graph.vertices;i++){
            ArrayList<Edge> arrayList=graph.adj.get(i);
            for(Edge edge: arrayList){
                System.out.println(i +" " + edge.destination +" with "+ edge.weight);
            }
        }
    }




    // weighted graph implementation
    public static void main(String[] args) {
        // Since we use
        Graph graph=new Graph(4);
        graph.addEdge(1,2,10);
        graph.addEdge(1, 3, 15);
        graph.addEdge(2,3,16);
        graph.addEdge(3, 4, 20);
        graph.addEdge(4, 2, 35);
        printGraph(graph);

    }

}