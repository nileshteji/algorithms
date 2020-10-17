class Node{
    Node left;
    Node right;
    int data;


    Node(int data){
        this.data=data;
    }
}


public class Solution{
   static Node root;

public static void main(String[] args) {
         root = new Node(1); 
        root.left = new Node(2); 
        root.right = new Node(3); 
        root.left.left = new Node(4); 
        root.left.right = new Node(5); 
        root.left.left.left = new Node(8);
        if(isBalanced(root)){
            System.out.println("Balanced");
        }
        else{
            System.out.println("Not");
        }
    
}

    static boolean isBalanced(Node root){

     if(root==null){
    return true;
       }
else{


        

        int lh;
        int rh;
        lh=height(root.left);
        rh=height(root.right);

        if(Math.abs(lh-rh)<=1 && isBalanced(root.left) && isBalanced(root.right)){
            return true;
        }
        else{
            return false;
        }

    
    }

    }
    static int height(Node root){
        if(root==null){
            return 0;
        }
        else{
            return 1+Math.max(height(root.left), height(root.right));

        }
    }
}