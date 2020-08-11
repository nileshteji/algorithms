

class Node{
    int data;
    Node next;

    public Node(int data){
        this.data=data;
    }
}
class Solution{
    public static void main(String[] args) {
        Node root=new Node(1);
        root.next=new Node(2);
        root.next.next=new Node(3);
        root.next.next.next=new Node(4);
        root.next.next.next.next=new Node(5);


       Node slow=root;
       Node fast=root;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }

        System.out.println(slow.data);
    }
}