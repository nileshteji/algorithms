class Node{
    Node left;
    Node right;
    int data;
    public Node(int data){
this.data=data;
    }
}
public class Solution {

    static Node root;
    public static void main(String[] args) {
        root=new Node(5);
        root.left=new Node(2);
        root.left=new Node(1);
        root.left.right=new Node(3);
        root.right=new Node(4);

    }


   
  