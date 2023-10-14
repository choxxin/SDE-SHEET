class Solution {
    public void sortColors(int[] nums) {
      
         int left=0;
         int mid=0;
         int right=nums.length-1;
         //base condition
        while(mid<=right){
          //  if 0 then swap left mid 
             if(nums[mid]==0){
                 swap(nums,mid,left);
                 mid++;
                 left++;
             }
             //if mid 2 then swap mid right 
             else if(nums[mid]==2){
                 swap(nums,mid,right);
                 
                 right--;
             }
             else{
                 //if mid 1 then swap mid++
                 mid++;
             }
           
             }
         }
        void  swap(int [] nums,int p1,int p2){
             int temp=nums[p1];
             nums[p1]=nums[p2];
             nums[p2]=temp;
         }
     
    }
