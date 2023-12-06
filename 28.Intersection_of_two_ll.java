public class Solution {

     //APPROACH 1

     //This works bcz when two pointer iterate their nodes and the time they hit null changes the head result to 
     //come both the pointer at one position .And hence from their we can check the value 


    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    //boundary check
    if(headA == null || headB == null) 
     return null;
    
    ListNode a = headA;
    ListNode b = headB;
    
    //if a & b have different len, then we will stop the loop after second iteration

    //the moment both the listnode becomes same we will out of loop and return the Listnode
    while( a != b){
    	//for the end of first iteration, we just reset the pointer to the head of another linkedlist
        a = a==null? headB : a.next ;
        b = b==null? headA : b.next ;    
    }
    
    return a;
    }



   //APPROACH 2


    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
      ListNode tempA=headA;
      ListNode tempB=headB;
      int lengthA=0;
      int lengthB=0;
      //Find the length of firstList
      while(tempA!=null){
          tempA=tempA.next;
          lengthA++;
      }  
      //2nd one
      while(tempB!=null){
          tempB=tempB.next;
          lengthB++;
      }
        //If length A grater we will move headA to match the pointer to go on simountanously 
        while(lengthA>lengthB){
            lengthA--;
            headA=headA.next;

        }
        //Similarly
        while(lengthB>lengthA){
            lengthB--;
            headB=headB.next;
        }
        //Once we set both the pointer at one place we can move them simountanously and check for similar answer 
        while(headA!=headB){
            headA=headA.next;
            headB=headB.next;

        }
        return headA;


         




    }

}
//Both the approach is efficient but only diff is that in 2nd approoach we have to write a lot 
//learn the first approach it is conceptual