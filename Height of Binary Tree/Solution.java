class Node {
    Node left;
    Node right;
    int data;
    Node(int data){
        this.data=data;
    }
}
class Solution {
    static Node root;

    public static void main(String[] args) {
        root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        System.out.println(printHeight(root));
   

    }

     static int printHeight(Node root)
     {
         if(root==null){
             return 0;
         }
         else{
             int leftDepth=printHeight(root.left);
             int rightDepth=printHeight(root.right);

            return 1+Math.max(leftDepth, rightDepth);
         }
     }
    
}