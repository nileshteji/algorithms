
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
        root=new Node(3);
        root.left=new Node(1);
        root.right=new Node(4);
        if(check(root, Integer.MIN_VALUE, Integer.MAX_VALUE)){
            System.out.println("BST");
        }
        else{
            System.out.println("NO BST");
        }
    }

    public static boolean check(Node root, int min, int max) {
       if(root==null){
        return true;
    }
    if(root.data<min || root.data>max){
        return false;
    }
    else{
        // In this we check the left tree should have the minium value of the anything but the max value for the left subtree should be node.data-1
        // Similarly for the right subtree the minium value should be the root node and the maxium can be anything
        return check(root.left,min,root.data-1) && check(root.right,root.data+1,max);
    }
}




}