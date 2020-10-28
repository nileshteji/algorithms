import java.time.temporal.Temporal;

class Node
{
	int data;
	Node left, right;

	public Node(int item)
	{
		data = item;
		left = right = null;
	}
}

/* Class to print the Diameter */
class BinaryTree
{
	Node root;
int res;


	int diameter(Node root)
	{

		if (root == null)
			return 0;


		int lheight = height(root.left);
		int rheight = height(root.right);
		int temp=Math.max(lheight, rheight)+1;
		int ans=Math.max(temp, lheight+rheight+1);
        res=Math.max(res, ans);
		return temp;

		// in this conditon means we are taking the root as the left node and the right node


	}


	int diameter()
	{
		return diameter(root);
	}


	static int height(Node node)
	{

		if (node == null)
			return 0;

		return (1 + Math.max(height(node.left), height(node.right)));
	}

	public static void main(String args[])
	{

		BinaryTree tree = new BinaryTree();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		tree.diameter();
		System.out.println(tree.res);
	}
}
