 
class Solution {
    //Our approach is to use  a hashset to get a acessof o(1) 

    public int longestConsecutive(int[] nums) {
         HashSet<Integer> set = new HashSet<>();
         //Add all element in the hashset
          for(int i :nums){
            set.add(i);
          }
        
        int longest=0;

        for(int i=0;i<nums.length;i++){
            //if the nums[i]-1 doesn't exist in the hashset that mean it the starting point of any sequence 
            //Input: nums = [100,4,200,1,3,2]
            //Output: 4
            //in this case 100,200,1 is that starting point
            if(set.contains(nums[i]-1)==false){
                //from each starting point try to find how much next and next elemnt exist in haset to find the length  of sequence 
                int length=0;
               //100-1(As no 101 exist) ,200-1(as no 201 exist) ,1-4(as 2,3,4 exist in hashet)
                while(set.contains(nums[i]+length)){
                    length+=1;
               
                }
                //now always compare the longest and length
                longest=Math.max(length,longest);
                
            }
        }
        return longest;
        


    }
}