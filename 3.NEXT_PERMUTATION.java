class Solution {
    public void nextPermutation(int[] nums) {
        //first find the digit from last such that i<i+1 ex: 41532 ,here 1 is the that no mark that point as i and next to it i+1;
       int  i=nums.length-2;
        while(i>=0 && nums[i]>=nums[i+1]){
            i--;
        } 
        //again from last find no greater than i mark it as j 
        if(i>=0){
         int j= nums.length-1;
         while(j>=0 && nums[j]<=nums[i]){
             j--;
         } 

         //swap i and j pointer
         swap(nums, i,j);
        }
         //reverse i+1 to last elemnt
          reverse(nums, i+1 , nums.length-1 );


         

          





   

    }
     public static void swap( int nums[], int i , int j){
              int temp = nums[i];
              nums[i]=nums[j];
             nums[ j]= temp;

          }
    public static void reverse( int nums[] , int i , int j ){
        while(i<=j){
            swap(nums,i,j);
            i++;
            j--;
        }
        
    }
}