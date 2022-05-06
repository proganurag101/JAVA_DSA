/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next==null){
            return null;
        }
        
        int size=0;
        
        
        ListNode currnode = head;
        while(currnode!=null){
            currnode = currnode.next;
            size++;
        }
        if(n==size){
            return head.next;
        }
        //distance from start of previous node
        int dfsp = size-n; //this is 5-2 = 3 ,3rd node should get address of next to next node
        ListNode prevNode = head;
        int i=1;
      
    /*   (1)->(2)->(3)->(4)->(5)      
    distance from start of prev(dfsp) = size(5)-n(2) = 3;
    newNode = head
    1st iteration:-
    newNode = newNode.next; (we get to 2nd node)
    
    2nd iteration:-
    newNode = newNode.next (now 2nd's next is third,we get to third in 2 iteration)
    
    */
   
     
          
        while(i<dfsp){  //we need only no. of nodes travelled iteration here 2.
            prevNode = prevNode.next;
            i++;
          
         
        }
      //now as we reached 3rd we take address of 4th node from 3rd and replace it with address of 5th node from 4th node(i.e prev.next=address of 4th node in 3rd node,prev.next.next = address of 5th node in 4th )
        prevNode.next = prevNode.next.next;        
        return head;
        
        
        
    }
}
