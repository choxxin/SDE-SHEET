class Solution {
    public int search(int[] nums, int target) {
        int start =0;
        int end = nums.length-1;
         
         

           while(start<= end){
               int mid=    start+ (end-start)/2;
            if(nums[mid]==target ){
                return mid;
            }
          //if left part is shorted 
          if(nums[mid]>=nums[start] ){
              if( target >=nums[start] && target < nums[mid]){
                  end=mid-1;
              }

              else{
                  start=mid+1;
              }

         
           }
          //if right part is shorted
          else{
           
              if(target <= nums[end] && target>nums[mid ]){
                  start=mid+1;
              }
              else{
                  end=mid-1;
              }
          

          }

         }
         return -1;
    }
}









    