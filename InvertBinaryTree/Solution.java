class Node{
    int data;
    Node left,right;
    public Node(int data){
        this.data=data;
    }
}

public class Solution{
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.right.left=new Node(4);
        root.right.right=new Node(5);
    }


    static Node mirror(Node root){
        if(root==null){
          return root;
        }
    }
} 