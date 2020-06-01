// In this Tortoise Hare Algorithm  

//Slow pointer and Fast Pointer 


// Same as Finding the Middle Element Linked List 


// But we have to check if the pointer are same or not 

class Node{
    int data;
Node next;
}

class Solution{


static boolean check(Node node)
{
 Node fastPointer=node;
 Node slowPointer=node;
 
 

 while(fastPointer!=null && fastPointer.next!=null){
     slowPointer=slowPointer.next;
     fastPointer=fastPointer.next.next;

     if(slowPointer==fastPointer){
         return true;
     }

 }

//if it exits the loop then it means no loop is in the LinkedList
 return false;
}


}