class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        //sort the array so that repeating elemnt come together
        Arrays.sort(nums);
      //The approach is to fix one point and use two pointer approach to find the sum of other two point 
        List<List<Integer>> ans = new LinkedList<>();
      for(int i=0;i<nums.length-2;i++){
          //if the no is repeating skip that elemnt
          if(i>0 && nums[i]==nums[i-1]){
             continue;
          }
          //keep the left pointer one ahead of left 
          int l=i+1;
          int r=nums.length-1;
          while(l<r){

              int threesome=nums[i]+nums[l]+nums[r];
              if(threesome<0){
                  l=l+1;
              }
              else if(threesome>0){
                  r=r-1;
              }
              else{
                List<Integer> list = new LinkedList<>();
                list.add(nums[i]);
                list.add(nums[l]);
                list.add(nums[r]);
                ans.add(list);
                //THis is confusing but most imp part
                //we need to move left pointer one ahead when we hit zero
                l+=1;
                //we  need to keep moving left pointer ahead until theres no repeating digit to avoid same sum
                while(nums[l]==nums[l-1] && l<r){
                    l+=1;
                }
                
                
              }





          }
      }
      return ans;
    }
}
//TC:- O(nlogn)+o(nsquare)
//So tc reduces to O(n squre ) # as nsquare tc is much bigger than tc of O(logn)
//The space complexity of your code is dominated by the space used for storing the ans list, which can grow to a maximum size of O(n) if all possible triplets are valid.

//So, the space complexity is O(n) or o(1) depending upon the shorting library