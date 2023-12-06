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
    public boolean isPalindrome(ListNode head) {
        
          if( head==null || head.next==null){
                return true;
            
            }
            //reverse 2nd half
             ListNode mid= findmid(head);   
             ListNode prev=null;
              ListNode curr=mid;
             ListNode  next;
             while(curr!=null){
                next=curr.next;
                curr.next=prev;
                prev=curr;
                curr=next;


             }

             //Making the prev counter which will be now a mid for us
             ListNode right=prev;
             ListNode left=head;

             //match
             while(right!=null){
                if(left.val!=right.val){
                  return false;
                }
                left=left.next;

                   right=right.next;


                }
                return true;
             }

             //To  find the mid
              public  ListNode findmid(ListNode head ){
            ListNode slow =head;
            ListNode fast =head;
            
            while(fast!=null && fast.next!=null){
                slow=slow.next;
                fast=fast.next.next;
            }
            return slow;

           }
    }
