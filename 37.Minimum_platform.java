User function Template for Java

class Solution
{
    //Function to find the minimum number of platforms required at the
    //railway station such that no train waits.
    static int findPlatform(int arr[], int dep[], int n)
    {    
        
        //Take two pointer i and j ,make both the arr sorted and compare arrival and dep time 
        //update the pointer and result (result  is the maximum of the plat_needed)
        Arrays.sort(arr);
        Arrays.sort(dep);
        int plat_needed=1;
        //result is the no of min platform required
        //Intialise with 1 as atleast one of it would be filled
        int result=1;
        int i=1;
        int j=0;
        //Both the pointer should be less than the suize of the array
        
        while(i<n && j<n){
            //more platform required
            if(arr[i]<=dep[j]){
                
                plat_needed++;
                i++;
            }
            //one less platform is required
            else if(arr[i]>dep[j]){
                plat_needed--;
                j++;
            }
            //result should be bigger always
            if (plat_needed>result)
            result=plat_needed;
            
            
            
        }
        return result;
         
    }
    
}

