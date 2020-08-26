import java.util.Stack;

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
        while(stack.empty()==false || root!=null){
            while(root!=null){
                stack.push(root);
                root=root.left;
            }
        
        }
    }
}
