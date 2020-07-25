class Node{
	Node left;
	Node right;
	int data;
	Node(int data){
		this.data=data;
	}

}
class Solution{
	static int answer=0;
	static Node root;
	public static void main(String[] args) {


		/*

		1

      2   3

     4     5

		*/
		root=new Node(1);
		root.left=new Node(2);
		root.right=new Node(3);
		root.left=new Node(4);
		root.right.right=new Node(5);System.out.print(height(root));

		
	}
	public static int  height(Node root){
        if(root==null){
        	answer=answer+0;
        	return 0;
        	
        }
       else{
            int leftHeight=height(root.left);
            int rightHeight=height(root.right);

            return leftHeight+rightHeight+1;
           

       }



        
	}
}