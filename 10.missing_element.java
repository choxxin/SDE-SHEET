class Solution {
    // we will calculate teh diff of each elemnt
    public int missingNumber(int[] nums) {
     int result=0;
     for(int i=0;i<nums.length;i++){
        result+=((i+1)-nums[i]);  //sum[1,2,3]-sum[3,0,1]=2 aka missing element
        


     }
     return result;
     
        
    }
}