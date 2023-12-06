class Solution
{
    //Function to find the maximum profit and the number of jobs done.
    int[] JobScheduling(Job arr[], int n)
    {
        
        //we are greedy here ,so we will sort the array on the basis of profit
        //This is the synatax to sort with respect to profit is:
       Arrays.sort(arr,(a,b) -> (b.profit-a.profit));
       // finding max no of deadlines
       int max=0;
       for(int i=0;i<n;i++){
           max=Math.max(max,arr[i].deadline);
           
       }
       //making arr of size of max
       int result[]=new int[max+1];
       Arrays.fill(result,-1);
       
         int maxprofit=0,countoffer=0;
       //
       for(int i=0;i<n;i++){
           for(int j=arr[i].deadline;j>0;j--){
               //check slot
               if(result[j]==-1){
                   result[j]=i;   //This line is not nesecasrry 
                   countoffer++;
                   maxprofit+=arr[i].profit;
                   break;
                   
                   
                   
               }
               
               
               
           }
       }
       //return type here is no of offere and total profit made with it..
         
       
       int ar[]= new int[2];
       ar[0]=countoffer;
       ar[1]=maxprofit;
       return ar;
    }
}

/*
class Job {
    int id, profit, deadline;
    Job(int x, int y, int z){
        this.id = x;
        this.deadline = y;
        this.profit = z; 
    }
}
*/