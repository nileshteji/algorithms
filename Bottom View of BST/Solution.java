 import java.util.HashMap;

class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
    }
}
public class Solution {

    static Node root;
    static HashMap<Integer,Integer> values=new HashMap<>();

    static void bottom(Node root,int hd){

    if(root==null)
    {
        return;
    }
    else{


        // just add putufAbsent function to use the topmost view of binary tree phew simple
        values.put(hd,root.data);
        bottom(root.left, hd-1);
        bottom(root.right,hd+1);
    }



    }
    public static void main(String[] args) {

        root = new Node(20);
        root.left = new Node(8);
        root.right = new Node(22);
        root.left.left = new Node(5);
        root.left.right = new Node(3);
        root.right.left = new Node(4);
        root.right.right = new Node(25);
        root.left.right.left = new Node(10);
        root.left.right.right = new Node(14);
        bottom(root, 0);
        System.out.println(values);

    }

}
