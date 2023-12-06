class Solution {
    public int findDuplicate(int[] nums) {
        
        int slow=0;
        int fast=0;
        //move slow once and fast twice
        //STEP 2
        while(true){
            slow=nums[slow];
            fast=nums[nums[fast]];  //this is to move fast two times
            if(slow==fast){
                break;
            }
        }
        //STEP 2
        //slow 2 starts from start and slow from the prev point of intesection.
        //move both the slow and find where they meet.
        //the point of meeting of both the slow  is the start of the cycle and it will be the repeating no in the array
        int slow2=0;
        while(true){
            slow=nums[slow];
            slow2=nums[slow2];
            if(slow==slow2){
                return slow;
            }
        }


    }
}