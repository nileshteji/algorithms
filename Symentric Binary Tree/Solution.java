public class Solution {
    public static void main(String[] args) {
        
    }

    static public boolean isMirror(Node root,Node root1){
        if(root==null && root1==null){
            return true;
        }
        if(root!=null && root1!=null && root.data==root1.data){
           return isMirror(root.left, root1.right) && isMirror(root.right, root1.left);   
        }


        return false;
    }
}