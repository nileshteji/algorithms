/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {


        // we are exactly doing something shitty this is a stupid question
        // we just need to make the value of the delete node to next node value
        //we just need to point the node pointer to the next to next pointer
       node.val=node.next.val;
        node.next=node.next.next;
}


    }
}
