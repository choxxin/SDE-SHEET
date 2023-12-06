class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        //This is the traditional trick used to create a LL dummy.next will act like our head and dummy will be like dummy head and tail will be moving to last eventually ;
        ListNode dummy=new ListNode();
        ListNode  tail=dummy;

      //We are going to start from L1 and L2 and compare them attach to tail
        while(list1!=null && list2!=null){
           if(list1.val<list2.val){
               tail.next=list1;
               list1=list1.next;

           }
           else  {
               tail.next=list2;
               list2=list2.next;
           }
           tail=tail.next;
 


     //THis is to avoid one edge case where suppose we attached all element of l1 or l2 then we would be remaing with the rest of elemnt so we would attach the tail.next to that node and it wont be a matter as they are already shorted
        }
        if(list1!=null){
            tail.next=list1;
        }
        else  {
            tail.next=list2;
        }






   //not dummy as as our list start from dummy .next;
    return dummy.next;

    }
}