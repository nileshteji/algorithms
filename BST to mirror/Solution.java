import org.graalvm.compiler.graph.Node;

class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
       this.data=data;
    }

}
class Solution{
    public static void main(String[] args) {
        Node root=new Node(2);
        root.left=new Node(3);
        root.right=new Node(4);

    }



    static public Node mirror(Node root){


        if(root==null){
            return null;
        }
        Node left=mirror(root.left);
        Node right=mirror(root.right);

        root.left=right;
        root.right=left;

        return root;

    }
}