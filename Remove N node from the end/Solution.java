  
  class ListNode{
      int val;
      ListNode next;
      ListNode(int data ){
data=val;
      }
  }
  class Solution{


    public ListNode remove(ListNode head,int n){
  
    ListNode start = new ListNode(0);
    ListNode n1 = start, n2 = start;
    n2.next = head;
    
    for(int i =0;i<n+1;i++){
        n2 = n2.next; // trying o create gab n between two pointers
    }
    
    while(n2 != null){
        n1 = n1.next;
        n2 = n2.next;
    }
    
    //time to change
    n1.next = n1.next.next;
    return start.next;
}

public static void main(String[] args) {

}

}


// 1 2 3 4 5
// In this problem we will take 2 pointers 
// One pointer will have a gap of n from the slow pointer 
// after that we will loop till the fast pointer doesnot come to the end 
// the slow pointer will be before the element which needs to be deleted.