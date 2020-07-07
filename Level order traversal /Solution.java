import java.util.LinkedList;
import java.util.Queue;

class Node {
    Node left;
    Node right;
    int value;
    Node(int value){
        this.value=value;
    }
}

public class Solution {
    static Node root;
    public static void main(String[] args) {
        //Test Case is taken by GFG
        root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        levelOrder();


    }

    static void levelOrder(){
       Queue<Node> queue=new LinkedList<>();
       queue.add(root);
        while(!queue.isEmpty()){
           Node temp=queue.poll();

           System.out.println(temp.value);

           if(temp.left!=null) queue.add(temp.left);
           if(temp.right!=null) queue.add(temp.right);
                    
       }
    }
}