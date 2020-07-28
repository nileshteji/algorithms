import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

class Node {
    Node leftNode;
    Node rightNode;
    int data;

    Node(int data) {
        this.data = data;
    }
}

public class Solution {
    static Node root;

    public static void main(String[] args) {
        root = new Node(5);
        root.leftNode = new Node(3);
        root.rightNode = new Node(6);
        findSum(root, 11);
    }
   public static void findSum(Node root,int sum){
       
   }
   
}