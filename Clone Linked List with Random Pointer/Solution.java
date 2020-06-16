// Java program for reversing the linked list 

class LinkedList { 

	static Node head; 

	static class Node { 

		int data; 
		Node next; 

		Node(int d) 
		{ 
			data = d; 
			next = null; 
		} 
	} 

	
	void printList(Node node) 
	{ 
		while (node != null) { 
			System.out.print(node.data + " "); 
			node = node.next; 
		} 
	} 

	public static void main(String[] args) 
	{ 
		LinkedList list = new LinkedList(); 
		list.head = new Node(85); 
		list.head.next = new Node(15); 
		list.head.next.next = new Node(4); 
        list.head.next.next.next = new Node(20); 
        list.printList(head); 
        Node headTemp=head;
        System.out.println();
        list.printList(headTemp);
		
	} 
} 


