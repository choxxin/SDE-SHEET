class Solution {


    //APPROACH: WHENEVER we need too maintain increasing order   we use STACK.
    //1) Here we taking two array for every bar deciding the left and right boundaries and calculating the area 
    //2) The max in the ans .



    public int largestRectangleArea(int[] heights) {
        int n= heights.length;
        int leftmin []= new int[n]; //this cointains the left minimum boundaries of every elemnt index wise
        int rightmin[] = new int[n];// this .............right ...........................................
        Stack<Integer> st = new Stack<>(); ///we will store the index only in the stack. (WE NEED TO MAINTAIN            INCREASING ORDER IN LEFTMIN STACK AND IN RIGHTMIN)

    //1 LEFTMIN
       for(int i =0 ;i<n;i++){
                         //if stack is not empty and  if top of stack elemnt is greater than the current index remove.
        while(!st.isEmpty() && heights[st.peek()]>=heights[i]){
            st.pop();
        }
                         //if stack empty means no leftmin boundarie so put 0;
        if(st.isEmpty()) leftmin[i]=0;
        else leftmin[i]=st.peek()+1;    //put in leftmin by adding 1 from stack index

        st.push(i);   
       }


        //clear the stack;
        while(!st.isEmpty()){
            st.pop();
        }


    //2 RIGHTMIN


        for(int i=n-1;i>=0;i--){
             //similarly just maintain increasing  order
            while(!st.isEmpty() && heights[st.peek()]>=heights[i]){
            st.pop();
        }
           //if empty put rightmost elemnt.
       if(st.isEmpty()) rightmin[i]=n-1;
       else rightmin[i]=st.peek()-1;     //put in leftmin by subtarcting  1 from stack index

        st.push(i);




        }
     //3 CACLULATE THE MAX AREA.
        int max=0;
        for(int i=0;i<n;i++){
                  //FORMULA for calculating the area.
            max=Math.max(max,(rightmin[i]-leftmin[i]+1)*heights[i]);
        }









       return max;








    }
}