//done on my own fully;

class Solution {
    public String countAndSay(int n) {
        return  recurse("1",n);
    }

    public String recurse(String s,int n ){

        if(n==1){
            return s;
        }
     
     int index=0;
      StringBuilder sb = new StringBuilder();
     while(index<s.length()){
        
        int count=1;
        while( index<s.length()-1 && s.charAt(index)==s.charAt(index+1)){
            count++;
            index++;

        }
        char c=(char) (count+'0');
        sb.append(c);
        sb.append(s.charAt(index));
        index++;

     }
      n--;
     return recurse(sb.toString(),n);
  


    }
}