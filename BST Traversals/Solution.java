import java.util.*;

class Node {
    int data;
    Node left, right;

    public Node(int item) {
        data = item;
        left = right = null;
    }
}

public class Solution {

    static void printInorder(Node root) {

        if (root == null) {
            return;
        }

        printInorder(root.left);
        System.out.print(root.data + " ");
        printInorder(root.right);

    }

    static void printPreOrder(Node root) {
        if (root == null)
            return;

        System.out.print(root.data + " ");

        printPreOrder(root.left);
        printPreOrder(root.right);

    }
    
    static void printPostorder(Node root) 
    { 
        if (root == null) 
            return; 
  
        printPostorder(root.left); 
        printPostorder(root.right); 
  
        System.out.print(root.data + " "); 
    } 

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(3);
        root.left.right = new Node(4);
        root.right = new Node(5);
        printInorder(root);
        System.out.print("\n"); 
        printPreOrder(root);
        System.out.print("\n"); 
        printPostorder(root);
    }
}
