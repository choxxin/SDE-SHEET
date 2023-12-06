import java.util.*;
class Solution {
    public int subarraySum(int[] nums, int k) {
        int res=0;
        int sum=0;
        int currentsum=0;
        HashMap<Integer,Integer> map = new HashMap<>();
        //we will put 0,1 as bydefault int he map
        map.put(0,1);
        for(int i =0 ;i<nums.length;i++){
            //we will check that the currentsum exist in map or not 
            //if doesn't add currsum to map
            
            sum+=nums[i];
            currentsum=sum-k;
            //if exist then add to res
            if(map.containsKey(currentsum)){
                 res+=map.get(currentsum);
             }    
             //if the no does,t exist add in map if exist then increase the count
             map.put(sum,map.getOrDefault(sum,0)+1);

            
            }




        
        return res;





    }
}