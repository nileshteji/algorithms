class Solution {
    public Node connect(Node root) {
        if(root == null){
            return root;
        }
        handle(root);
        return root;
    }

    private void handle(Node node){
        if(node.left != null){
            node.left.next = node.right;
        }
        if(node.next != null && node.right != null){
            node.right.next = node.next.left;
        }
        if(node.left != null){
            handle(node.left);
        }
        if(node.right != null){
            handle(node.right);
        }
    }
}