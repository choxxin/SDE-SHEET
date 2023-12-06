 //Qestion:-You are given the node to be deleted node. You will not be given access to the first node of head.
 /*Input: head = [4,5,1,9], node = 5
Output: [4,1,9]
Explanation: You are given the second node with value 5, the linked list should become 4 -> 1 -> 9 after calling your function.*/
class Solution {
    public void deleteNode(ListNode node) {
        
         //we would keep the next node value into curr and dlete the next node.This will help to delete that node.
        node.val=node.next.val;
        node.next=node.next.next;
    }
}