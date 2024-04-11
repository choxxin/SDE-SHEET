import java.util.*;
//CODING NINJA PROBLEM 
public class Solution{
    static class Stack {
        int capacity;
       ArrayList<Integer> list ;
        Stack(int capacity) {
        this.capacity=capacity;
        this.list= new ArrayList<>();
        }
        public void push(int num) {
            if(list.size()<capacity){
           list.add(num);
            }
        }
        public int pop() {
            if(list.isEmpty()){
                return -1;
            }
            else{
           
            return   list.remove(list.size()-1);
            }
            
        }
        public int top() {
            if(list.isEmpty()) return -1;
          return list.get(list.size()-1);
        }
        public int isEmpty() {
            // Write your code here.
            if(list.size()==0){
                return 1;
            }
            else return 0;
        }
        public int isFull() {
            // Write your code here.
         if (list.size()>=capacity) return 1;
         else return 0;
        }
    }
}