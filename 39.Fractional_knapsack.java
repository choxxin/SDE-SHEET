/*
class Item {
    int value, weight;
    Item(int x, int y){
        this.value = x;
        this.weight = y;
    }
}
*/
class itemcomparator implements Comparator<Item>{
    
    //As we need the ratio of value by weight to sort
   public int compare(Item a,Item b){
       double r1 =(double)a.value / (double)a.weight;
       double r2=(double)b.value /(double)b.weight;
        
        //we are going to sort the ratio of these seq in descending order to get max value
        //Sorting in desending order to get max value
       if(r1<r2){
           return +1;
       }
       else if (r1>r2){
           return -1;
       }
       else{
           return 0;
       }
       
       
   }
}

class Solution
{
    //Function to get the maximum total value in the knapsack.
    double fractionalKnapsack(int W, Item arr[], int n) 
    {
     //For comparator  we write new comparator  
    Arrays.sort(arr,new itemcomparator());
    
    
    int currsum=0;
    double finalvalue=0.0;
    //We can add a part also so everytime we check is our total weight is less than require weight or not
    //if yes,then add its weigh and value
    for(int i=0;i<n;i++){
        if(currsum+arr[i].weight<W){
            currsum+=arr[i].weight;
            finalvalue+=(double)arr[i].value;
        }
        //if not find the remaining weight 
        //add that remianinh sum to complete  the required suma  
        //and add finalvalue the ratio of value/weight*remain to get amount of value add up to that of remaining weight 
        
        else{
            int remain=W-currsum;
            currsum+=remain;
            
            finalvalue+=(double)arr[i].value/(double)arr[i].weight*(double)remain;
             //break not necessary but for good
             break;
        }
    }
    return finalvalue;
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
         
    }
}