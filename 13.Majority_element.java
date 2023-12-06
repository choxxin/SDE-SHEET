class Solution {
    //  /Boyer–Moore majority vote algorithm
    public int majorityElement(int[] nums) {
         int count=0;
         int res=0;
         for(int i =0 ; i<nums.length;i++){
         //We are iterating in hte array to find the majority elemnt and we are increasing and decresing count and res 
         //when same elemnt repeats that mean need to increase count
         //when diffrent elemnt comes then decrease the count
         //the  moment when count becomes zero change the res to current elemnt in the nums 
         //When count is zero means the no of diffrent elemnt is same and the current elemnt is going to decide which is majority.
             if(count==0){
                 res=nums[i];
             }

             if(res==nums[i]){
                 count+=1;

             }
             else{
                 count-=1;
             }
         }
         return res;
    }
}











/* public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        return nums[n/2];
    }
    */