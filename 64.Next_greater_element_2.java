class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n =nums.length;
        Stack<Integer> st = new Stack<>();
        int arr []= new int[nums.length];
        // int count=n-1   ;

        //Array is circular so ,instead 
        for(int i=(2*n)-1;i>=0;i--){
            //pop if top is small as we have to maintain the increasing order downwardly
            while(!st.isEmpty() && st.peek()<=nums[i%n] ){    
             st.pop();
           
            } 
            //put the peek element in the ans;
            if(!st.isEmpty()){
            arr[i% n]=st.peek();
            }
            //if not empty then no more elemnt is there put -1 ;
            else{

                arr[i%n]=-1;
            }

            //fially put each and ever element
            st.push(nums[i%n]);
        }
        return arr;

    }
}