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
    //take three pointer 
    //everytime move each pointer forward and point current to prev to make them link inn reverse 
    //when the curr will be in null then prev would become head ,so we wills imply retun head
    public ListNode reverseList(ListNode head) {
        //take three pointer prev
        // curr 
        // next
        //these 3 pointer will move until the curr pointer become null and evertime we will make each node direction behind and return prev;
                ListNode prev=null;
                ListNode curr=head;

                ListNode next;


                while(curr!=null){
                  next=curr.next;
                  curr.next=prev;
                   prev=curr;
                   curr=next;




                }
               return prev;
            }
    }
