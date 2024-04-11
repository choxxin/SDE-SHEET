class Solution {
    public boolean isValid(String s) {
        
    Stack <Character> saa = new Stack  <Character>();
        for(int i=0 ; i<s.length();i++){
            char c =s.charAt(i);
        if(c=='(')
            saa.push(')');
        

       else if (c=='{')
            saa.push('}');
        
       else  if(c== '[')
            saa.push (']');
        
        else if (saa.isEmpty() || saa.pop()!=c)
            return false;
        

        
        }

    
    return saa.isEmpty();
}
}