class Node{
    Node left;
    Node right;
    int data;

    Node(final int data){
        this.data=data;
    }
}

public class Solutions {
    static Node root;

     private static Node findLCA(final int data,final int data2){
        return findLCA(root,data, data2);
    }

    private static Node findLCA(final Node root2, final int value1, final int value2) {
        if(root2==null){
            return null;
        }
       if(root2.data==value1|| root2.data== value2){
            return root2;
        }
        else{
            Node leftLCA=findLCA(root2.left, value1, value2);
            Node rightLCA=findLCA(root2.right, value1, value2);


            if(leftLCA!=null && rightLCA!=null){
                return root2;
            }
            else{
                return (leftLCA!=null) ? leftLCA : rightLCA;
            }
        }
    }

    public static void main(final String[] args) {
        root = new Node(1); 
        root.left = new Node(2); 
        root.right = new Node(3); 
        root.left.left = new Node(4); 
        root.left.right = new Node(5); 
        root.right.left = new Node(6); 
        root.right.right = new Node(7); 

        Node node=findLCA(4,5);
        System.out.println(node.data);
       

    }
}