class Solution {
    public boolean isAnagram(String s, String t) {
   //This is a freq array where we increase count and decrease count and if array dooesnt have 0 it is not a valid anagram.
//
         if (s.length()!= t.length()){
             return false;

         }
           int freq[] = new int [26];

           for(int i=0; i <s.length() ;i++){

           freq[s.charAt(i)-'a']++;
           freq[t.charAt(i)-'a']--;





           }


           for(int i =0; i<freq.length ; i++){
               if(freq[i]!=0){
                   return false ;

               }

           }
        
        return true;
    }
}