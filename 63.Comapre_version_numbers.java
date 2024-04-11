class Solution {
    public int compareVersion(String s, String t) {
        //
        int i=0;
        int j=0;
        while(i<s.length() || j<t.length()){
         int n=0;
         int m=0;
         while(i<s.length() && s.charAt(i)!='.'){
            n=n*10+(s.charAt(i)-'0');
            i++;
         }

         while(j<t.length() && t.charAt(j)!='.'){
            m=m*10+(t.charAt(j)-'0');
            j++;
         }


        if(n<m){
            return -1;
        }
       else  if(n>m){
            return 1;
        }


        i++;
        j++;

    }

        return 0;
    }
}