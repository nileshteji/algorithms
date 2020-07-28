

class Node {
    Node left;
    Node right;
    int data;

    Node(int data) {
        this.data = data;
    }
}

public class Solution {
    static Node root;
    static Node prev;
    static Node answer;

    public static void main(String[] args) {
        root = new Node(12);
        root.left = new Node(7);
        root.left.left = new Node(2);
        root.left.right = new Node(8);
        root.right = new Node(24);
        toDLL(root);
       
        while(answer!=null){
            System.out.println(answer.data);
            answer=answer.right;
        }
    }

    public static void toDLL(Node root) {
        if(root == null) {
            return;
        }
        toDLL(root.left);
        if(prev==null){
            answer=root;
            prev=root;
        }
        else{
            root.left=prev;
            prev.right=root;
            prev=root;

        }
        toDLL(root.right);


    }
}