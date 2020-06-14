  
  
  class Solution{


    public void remove(ListNode head,int n){
  
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

}