

// what is BT :Binary Tree it is a normal tree which can have upto max 2 children Node;
// whereas BST is the Binary Search Tree which follow the min max contraint


class Node{
    Node left;
    Node right;
    int data;
    Node(int data){
        this.data=data;
    }
}
public class Solution {
    static Node root;

    public static void main(String[] args) {
        root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);

        check(root);
    }


    public static boolean check(Node root,int left,int right){
        if(root==null){
            return true;
        }
        if(root.data<left || root.data>right){
            return false;
        }
        else{
            
        }
    }
}