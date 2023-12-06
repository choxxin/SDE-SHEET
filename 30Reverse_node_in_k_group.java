class Solution {
    //approach:- We will reverse the elements 12 and then check everytime is length <k if thats the case we do nothing else      recursively add it.



    //function to find the length

    public int length(ListNode head){
        ListNode temp=head;
        int length=0;
        while(temp!=null){
            temp=temp.next;
            length++;
        }
        return length;
    }


      //recursive function to reverse
    public  ListNode  reverseKGroup(ListNode head ,int k ,int length){
       //base case
       //The moment we get no left less than k return it as it is .
       if(length<k){
           return head;
       }
       //code to reverse  a ll but with count 
       int count=0;
                //count is keeping eye to reverse less than k ele in one time
       ListNode prev=null;
       ListNode curr=head;
       ListNode next=null;
       while(count<k && curr!=null){
         next=curr.next;
         curr.next=prev;
         prev=curr;
         curr=next;
         count++;

       }
       if(next!=null){
           //recursive call with less length
          head.next= reverseKGroup(next,k,length-k);
       }

   return prev;

    } 
       //This is the main group
    public ListNode reverseKGroup(ListNode head, int k) {
        
        int length=length(head);
         return reverseKGroup(head,k,length);
    }


}