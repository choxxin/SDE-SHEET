class Solution {
    public int removeDuplicates(int[] nums) {
        // Take two pointer ,
        //one is replace ,which moves only when replace diffrent no
        //other pointer is i 
        //once u get no diffrent then repeated replace with replace 
        //return replace ,u will get to know how many diffrent types of elem is there
        // 0011122334
        //01234______
        //So basically we are finding diffrent types of no replacing it continously 
       int replace=1;
       for(int i=1;i<nums.length;i++){
         if(nums[i]!=nums[i-1]){
               nums[replace]=nums[i];
             replace++;
         }
       }
       return replace;
    }
}