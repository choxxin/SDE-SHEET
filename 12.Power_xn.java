class Solution {
    public double myPow(double x, int n) {
// In this version, when n is the minimum value, we decrement it by 1 to prevent overflow when taking its absolute value. We then handle the case accordingly. This should work for the given test case.
    if(n==Integer.MIN_VALUE){
         n = -(n + 1);  // To prevent overflow // x=2.00000 n=-2147483648
            x = 1 / x;
            return x * helper(x, n);
    //above code is to pass only one test case 
    }
      
     else if(n<0){
       n=-n;
       return 1/helper(x,n); //if the n to the power -ve
   }
   
   return helper(x,n); 
          
          
        
    }

    public static double  helper(double x,int n ){
      //base case
      if(n==0){
          return 1;
      }
      if(x==0){
          return 0;
      }
     double  res =helper(x,n/2); //using divide and conqur as we have to only multiply multiply same thing many time
      res=res*res;
      if(n%2==1){  //if n is odd then we have to multiply x one more time
          return res*x; 
      }
      return res; //else return same if n is even
    }
}