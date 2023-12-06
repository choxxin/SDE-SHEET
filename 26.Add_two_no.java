
 //here the given no are reversed in ll so we would add from startin and keep carry from starting 
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int curr=0;
        //initialsing the dummy node 
        ListNode dumyNode = new ListNode(-1);
        ListNode tail = dumyNode;

    //THe main confusion is there should be && in the while loop 
     //i m confused why we are using || instaed && 😥 
     //So the main thing is that the no is reversed so we have to carry from starting 
     //and this carry would be passed from starting 

            while(l1!=null || l2!=null || curr!=0 ){

                //so if we encounter diffrent length we would push zero in the nulled area
                int digit1 = (l1!=null) ? l1.val : 0;
                int digit2 =(l2!=null)  ?  l2.val : 0;
                 
                int sum = digit1+digit2+curr;
                  //0th place no is the digit we would add in our ll
                 int digit= sum%10;
                 //1st place no is the carry
                 curr= sum/10;
                 ListNode newNode = new ListNode(digit);
                 //attach it to the tail of our answer and move the answer pointer 
                   tail.next=newNode;
                   tail=tail.next;
                 //move the pointer if that is null remian the pointer null;
                l1= (l1!=null) ? l1.next : null;
                l2= (l2!=null)  ? l2.next : null;


                   

            

            }
            
         return dumyNode.next;




    }





    
}