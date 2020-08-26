import java.util.Stack;

import Solution.stack;

class Node{
    Node left;
    Node right;
    int data;
    
    public Node(int data){
        this.data=data;
    }
}
public class Solution {
    public static void main(String[] args) {
        Node root=new Node(10);
        root.left=new Node(11);
        root.left.left=new Node(2);
        root.left.right=new Node(-1);
        root.right=new Node(16);
        root.right.left=new Node(10);
        root.right.left.left=new Node(9);
        root.right.left.right=new Node(11);
        inorder(root);

    }
    static void postorder(Node root){
        Stack<Node> stack=new Stack<>();
        stack.push(root);
        while(stack.empty()==false || root!=null){
            System.out.println(stack.peek().data);
            Node temp=stack.pop();
            if(temp.right!=null){
                stack.push(temp.right);
            }
            if(temp.left!=null){
                 stack.push(temp.left);
            }
            
        }
    }
}
