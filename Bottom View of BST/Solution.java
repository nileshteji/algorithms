class Node{
int data;	
Node left;
Node right;

 Node(int data){
this.data=data;
}
}

public class Solution{
static Node root;


public static void main(String[] args){

root=new Node(1);
root.left=new Node(2);
root.right=new Node(3);


}

}
