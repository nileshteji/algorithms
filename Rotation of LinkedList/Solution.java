
import java.util.*;
class Solution
{ 
	Node head; 


	class Node 
	{ 
		int data; 
		Node next; 
		Node(int d) 
		{ 
			data = d; 
			next = null; 
		} 
	} 

	
	void rotate(int k) 
	{ 

        Node current=head;
        int count=1;
        while(count<k && current!=null){
            current=current.next;
            count++;
        }

        if(current==null)
            return;

        Node lastNode=current;

        // current is the k node 
        while(current.next!=null){
            current=current.next;
        }

        current.next=head;
    
        head=lastNode.next;
        lastNode.next=null;
        

    } 

//Addition at the starting of linked list 
	void push(int new_data) 
	{ 
        Node new_node = new Node(new_data); 
        new_node.next = head; 
        head = new_node;
    } 
       
	void printList() 
	{ 
		Node temp = head; 
		while(temp != null) 
		{ 
			System.out.print(temp.data+" "); 
			temp = temp.next; 
		} 
		System.out.println(); 
	} 

	/* Driver program to test above functions */
	public static void main(String args[]) 
	{ 
		Solution llist = new Solution(); 

		// create a list 10->20->30->40->50->60 
		for (int i = 60; i >= 10; i -= 10) 
			llist.push(i); 

		System.out.println("Given list"); 
		llist.printList(); 

		llist.rotate(4); 

		System.out.println("Rotated Linked List"); 
		llist.printList(); 
	} 
} /* This code is contributed by Rajat Mishra */
