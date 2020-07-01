import java.util.Arrays;

class Node { 
    int data; 
    Node left, right; 
  
    public Node(int item) 
    { 
        data = item; 
        left = right = null; 
    } 
} 


public class Solution {
static Node root;
   //This array inclkudes if the level of binary search tree is visited  
 static boolean[] arr=new boolean[10];

//Level Order Traversal 
   static void  leftBST(Node root,int level){
       if(root==null){
           return;
       }
    if(!arr[level]){
        System.out.println(root.data);
        arr[level]=true;

    }
    leftBST(root.left, level+1);
    leftBST(root.right, level+1);
   } 

    public static void main(String[] args) {
      Arrays.fill(arr, false);

        root = new Node(12); 
        root.left = new Node(10); 
        root.right = new Node(30); 
        root.right.left = new Node(25); 
        root.right.right = new Node(40); 
        leftBST(root, 0);
    
    
    
    }
}