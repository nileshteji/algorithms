

class Node{
    Node left;
    Node Right;
    int value;

    Node (int value){
        this.value=value;
}
}



public class Solution {
   static  Node root;
   static int leftValue=Integer.MIN_VALUE;
   static int rightValue=Integer.MIN_VALUE;
    public static void main(String[] args) {
        root=new Node(10);
        root.left=new Node(8);
        root.Right=new Node(2);
        root.left.left=new Node(3);
        root.left.Right=new Node(5);

        findMaxium(root);




        }


        static void  findMaxium(Node root){
            while(root.left!=null && root.Right !=null){
                if(root.left.value>root.Right.value){
                   root.value=+root.left.value;
                   root=root.left;
                }
                
                
            }

        }
}