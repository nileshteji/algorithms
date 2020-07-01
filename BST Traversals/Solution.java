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
        System.out.println(root.data);
        printInorder(root.right);

    }

    static void printPreOrder(Node root) {
        if (root == null)
            return;

        System.out.println(root.data);

        printPreOrder(root.left);
        printPreOrder(root.right);

    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(3);
        root.left.right = new Node(4);
        root.right = new Node(5);
        printInorder(root);
    }
}