/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class BSTIterator {
    List<TreeNode> list;
    int count=0;
    
    //Using inorder for the sorting order in BST
    public void Inorder(TreeNode root){
        if(root==null){
            return;
        }
        else{
            Inorder(root.left);
            this.list.add(root);
            Inorder(root.right);
        }
    }

    public BSTIterator(TreeNode root) {
        list=new ArrayList<>();
        Inorder(root);
    }
    
    /** @return the next smallest number */
    public int next() {
        return this.list.get(count++).val;
  }
    
    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        return this.count<this.list.size();
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */