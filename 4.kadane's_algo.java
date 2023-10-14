class Solution {
   public int maxSubArray(int[] nums) {
       //Initialise current sum =0 
       //maxsum = -infinity
    int cs = 0;  
    int ms = Integer.MIN_VALUE;
    for (int i = 0; i < nums.length; i++) {
        cs += nums[i];
        if (cs > ms) {
            ms = cs;
        }
        if (cs < 0) {
            cs = 0; // Reset cs to zero if it becomes negative becouse adding positive value with - ve value will make the possible maxsum small ,thats why its better to choose 0 .
        }
    }
    return ms;
}
    }
