

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }

}

// 7->5->4->9->6
// 8 -> 4
class Solution {
    public static void main(String[] args) {

        Node first = new Node(5);
        first.next = new Node(6);
        first.next.next = new Node(3);

        Node second = new Node(8);
        second.next = new Node(4);
        second.next.next = new Node(2);

        findSum(first, second);

    }

    static void findSum(Node a, Node b) {

        Node temp = null;
        Node res=null;
        int carry = 0;
        Node prev = null;

        while (a != null || b != null) {

            int sum = a.data + b.data+carry;
            carry = (sum >= 10) ? 1 : 0; 
            sum=sum%10;  
            temp=new Node(sum);
            if (res == null) {
               res=temp;
            } else {
                prev.next =temp;

            }
            prev =temp;
            a = a.next;
            b = b.next;

        }
        if (carry > 0) { 
            temp.next = new Node(carry); 
        } 



        while (res!= null) {
            System.out.println(res.data);
            res = res.next;
        }

    }

}
