class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        
         int N= nums.length;

        List<Integer> list = new LinkedList<>();
        List<List<Integer>> ans = new LinkedList<>();
        
        function(0,list,ans,nums,N);
    
        return  ans;

          


    }
    void function (int ind,List<Integer> list,List<List<Integer>> ans ,int [] nums,int N){
           //base case
           if(ind==N){
               ans.add(new LinkedList<>(list));
               return;
           }
           //first call without aadding ,empty lit
         function(ind+1,list,ans,nums,N);
        list.add(nums[ind]);
        //2nd call after adding the element 
        function(ind+1,list,ans,nums,N);
        //This is for backtracking
         list.remove(list.size() - 1);


    }
}