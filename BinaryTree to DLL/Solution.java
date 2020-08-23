
class Node{
    int data;
    Node left;
    Node right;
    public Node(int data){
      this.data=data;
    }
}
public class Solution {

    static Node root;
    static Node prev=null;
    static Node head=null;
    public static void main(String[] args) {
        root=new Node(10);
        root.left=new Node(12);
        root.right=new Node(15);
        root.left.left=new Node(25);
        root.left.right=new Node(30);
        root.right.left=new Node(36);    
    }

    static void convert(Node root){
  
        if(root==null){
            return;
        }

        // recursively move till the end of the tree
        convert(root.left);
 
         // if this is first element of the Doubly Linked List so we will make the head as the root;
        if(prev==null){
            head=root;
        }
        // this is else conditon in which we will point the current root left to the previous
        // and the previous right will extend to the current node.
        else{
            root.left=prev;
            prev.right=root;
        }
        prev=root;
         convert(root.right);
    }
}