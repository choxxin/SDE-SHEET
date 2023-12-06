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


 //here the given no are reversed in ll so we would add from startin and keep carry from starting 
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int curr=0;
        //initialsing the dummy node 
        ListNode dumyNode = new ListNode(-1);
        ListNode tail = dumyNode;

    //THe main confusion is there should be && in the while loop 
     //i m confused why we are using || instaed && 😥 
     //our approach is to find the last digit add in our list and the first digit would be carry and add the carry again
            while(l1!=null || l2!=null || curr!=0 ){


                int digit1 = (l1!=null) ? l1.val : 0;
                int digit2 =(l2!=null)  ?  l2.val : 0;

                int sum = digit1+digit2+curr;
                 int digit= sum%10;
                 curr= sum/10;
                 ListNode newNode = new ListNode(digit);
                   tail.next=newNode;
                   tail=tail.next;
                   //move the pointer if that us null remian the pointer null;
                l1= (l1!=null) ? l1.next : null;
                l2= (l2!=null)  ? l2.next : null;


                   

            

            }
            ListNode result = dumyNode.next;
            dumyNode.next=null;
         return result;




    }





    
}