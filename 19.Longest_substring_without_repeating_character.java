class Solution {
    //sliding window
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int result=0;
        int l=0;
        //use haset to find that the no is unique or not
    //we are going to take two point l and r 
    //if r is in set then remove left from set and move set by one 
        for(int right=0;right<s.length();right++){
           while(set.contains(s.charAt(right))){
                 set.remove(s.charAt(l));
                 l+=1;
 //if r isin't in set then add it 
//then compare length of right-left+1 with prev lengths ,this will give u results 

           }
            set.add(s.charAt(right));

          
           result=Math.max(result,right-l+1);
        }
        return result;
    }
}