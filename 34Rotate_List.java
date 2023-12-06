class Solution {
    public ListNode rotateRight(ListNode head, int k) {
         //This is the edge case
        if (head == null || head.next == null || k == 0) {
            return head;
        }

        int length = 1;
        ListNode tail = head;
        //To find the length
        while (tail.next != null) {
            tail = tail.next;
            length++;
        }
        //To round off the rotate ,bcz it will result in same thing
        k = k % length;
        
        if(k==0){ //THis is just to handle a test case where k=length
            return head;
        }
        int point = length - k - 1; // Corrected calculation

        return rotate(head, point, tail);
    }
    

    //We are directly going to attach roataed from head ,for this we need a rotate |point|
    public ListNode rotate(ListNode head,  int point, ListNode tail) {
        int i = 0;
        //end is the just before point of rotate 
        ListNode end = head;

        while (i < point) {
              end= end.next;
            i++;
        }
       
         //rotating part
         

         //making a list node temp which is going to our head 
        ListNode temp = end.next;
        end.next = null;
        //attaching the detached to our head
        tail.next = head;
         // returning temp our new head
        return temp;
    }
}
