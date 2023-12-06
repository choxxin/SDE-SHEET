class Solution {
       public List<List<Integer>> subsetsWithDup(int[] nums) {
           //we are sorting the array to skip the dupliacates in the future 

           Arrays.sort(nums);
           int N =nums.length;
   
        List<Integer> list = new LinkedList<>();
        List<List<Integer>> ans = new LinkedList<>();
         //Approach:- 1) we are going to make a call by adding elemnt 
      //               2) Then we are going to make the call bydeleting the last elmeent .
      //               3) The while loop helps to skip the same elment inorder to not get the repeated set .(IMP POINT )


         function ( nums , list ,ans,N,0);
   
         return ans;
     

    }
    void function(int nums[],List<Integer> list ,List<List<Integer>> ans,int N,int idx ){
         //base case
         if(idx==N){
           
             //this help to create a copy of the list ,so in future if we make a refrence call it wont gonna affect our list
            ans.add(new LinkedList<>(list));
            return;
         }

         list.add(nums[idx]);
         function(nums,list,ans,N,idx+1);

         list.remove(list.size()-1);
          

           //to skip duplicates
         while(idx+1<N && nums[idx]==nums[idx+1]){
             idx+=1;

         }
           function(nums,list,ans,N,idx+1);


          







    }
}