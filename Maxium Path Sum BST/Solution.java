
class Node {
    Node left;
    Node Right;
    int value;

    Node(int value) {
        this.value = value;
    }
}

public class Solution {
    static Node root;
    static int leftValue = Integer.MIN_VALUE;
    static int rightValue = Integer.MIN_VALUE;

    public static void main(String[] args) {
        root = new Node(-10);
        root.left = new Node(8);
        root.Right = new Node(2);
        root.left.left = new Node(3);
        root.left.Right = new Node(5);

        int a=findMaxium(root,Integer.MIN_VALUE);
        System.out.println(a);
    }
    static int findMaxium(Node root,int res){
        
         return findSum(root,Integer.MIN_VALUE);


    }


    static int findSum(Node root,int res){
        
        if(root==null){
            return 0;
        }
         int leftSum=findSum(root.left, res);
         int rightSum=findSum(root.Right, res);

         // if it is for positive value no need of the max dfunction this can also contain
         int max=Math.max(root.value, root.value+Math.max(leftSum,rightSum));
         // we have to check also for the max of the left sum and right sum 
         int maxOne=Math.max(max, leftSum+rightSum+root.value);

         return Math.max(res, maxOne);
    }
}