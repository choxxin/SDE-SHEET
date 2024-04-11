class Solution {
    public List<List<String>> partition(String s) {
        List<String> path = new LinkedList<>();
        List<List<String>> ans = new LinkedList<>();
        recursion(0, s, path, ans );
        return ans;
    }
   //simple code
    void recursion(int idx ,String s,List<String> path,List<List<String>> ans){
        //base case
        if(idx==s.length()){
            ans.add(new LinkedList<>(path));
            return;
        }

        for(int i=idx;i<s.length();i++){
            //make  a call only if the string is palindrome
           if(ispalindrome(s,idx,i)){            
                path.add(s.substring(idx,i+1));
                recursion(i+1,s,path,ans);
                path.remove(path.size()-1);


           }



        }






    }
    boolean ispalindrome(String s,int start ,int end){
        while(start<end){
            if(s.charAt(start)!=s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}