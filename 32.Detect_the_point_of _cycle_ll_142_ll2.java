/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode fast=head;
        ListNode slow=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            
            if(slow==fast){
                 //Finding the meeting point
                 //To find the cyclic point initialsise slow from head and the point from where it was the moment they meet is the cycle point
        slow=head;
        while(slow!=fast){
             slow=slow.next;
            fast=fast.next;

            
             

        }
        return slow;

            }
        }
        return null;
        
        }
        
}
