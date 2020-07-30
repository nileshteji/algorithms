import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;
class Graph {
    int value;
    List<Graph> neighbpurs;

    Graph(int data) {
        this.data = data;
        neighbpurs = new ArrayList<>();
    }
}

class Solution {
    public static void main(String[] args) {
        GraphNode node1 = new GraphNode(1);
        GraphNode node2 = new GraphNode(2);
        GraphNode node3 = new GraphNode(3);
        GraphNode node4 = new GraphNode(4);
        List<GraphNode> v = new ArrayList<>();
        v.add(node2);
        v.add(node4);
        node1.neighbours = v;
        v = new ArrayList<>();
        v.add(node1);
        v.add(node3);
        node2.neighbours = v;
        v = new ArrayList<>();
        v.add(node2);
        v.add(node4);
        node3.neighbours = v;
        v = new ArrayList<>();
        v.add(node3);
        v.add(node1);
        node4.neighbours = v;
    }

    static public Graph clone(Graph clone) {

        // Instead of Using of a HashMap we are using a set because we have no need of
        // key,Value pair and set have a faster data retrieval
        Queue<Graph> queue = new LinkedList<>();
        queue.add(clone);
        Set<Graph> visited = new HashSet<>();
        visited.add(clone);

        while (!queue.isEmpty()) {

            Graph temp = queue.poll();

            ArrayList<Graph> list = temp.neighbpurs;

            for (Graph graph : list) {

                if(!visited.contains(graph)){
                  queue.add(graph);
                  visited.add(graph);
                }

                temp.neighbpurs.add(graph);
            }
        }

        return null;

    }
}