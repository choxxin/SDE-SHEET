//
//Since every element in the sorted array appears exactly twice except for the single element, 
//we know that if we take any element at an even index (0-indexed), the next element should be the same. Similarly, 
//if we take any element at an odd index, the previous element should be the same. 
//Therefore, we can use binary search to compare the middle element with its adjacent elements to determine 
//which side of the array the single element is on.

//Expected TC:-(Olog(n))
class Solution {
    public int singleNonDuplicate(int[] nums) {
     
    if(nums.length==1) return nums[0];

    if(nums[1]!=nums[0]) return nums[0];
    if(nums[nums.length-1] != nums[nums.length-2])  return nums[nums.length-1];
     int start=1;
     int end =nums.length-2;
    while(start<=end){
        int mid=(start+end)/2;

        if(nums[mid]!=nums[mid-1] && nums[mid ]!=nums[mid+1]){
            return nums[mid];
        }
       if(mid%2==1 && nums[mid]==nums[mid-1]|| mid %2==0 && nums[mid]==nums[mid+1]){
         
           start=mid+1;
       }
       else{
           end=mid-1;
       }




    }
   return -1;
    
    


    }
}