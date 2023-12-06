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
/*
approach:- we will find the length of the array 
then length-n will give the exact position from starting we would make it next of next with diffrent listnode
*/
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode temp= head;
        int size=0;
        //temp listmode used to find  the size of temp
        while(temp!=null){
            temp=temp.next;
            size++;
        }
        //edge case if the size becomes n then we will remove the head and make next elemnt head
        if(size==n){
            head=head.next;
            return head;
        }
        
        int i =1;
        int ithfromend=size-n;
        ListNode prev=head;
        //prev will help me to get one before that element 
        
        while(i<ithfromend){
            prev=prev.next;
            i++;
        }
        //then ...
        prev.next=prev.next.next;
    
         return head;

    }
}