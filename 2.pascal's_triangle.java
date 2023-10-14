class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new LinkedList<>();
        //make two list and add row in ans everytime with the same no of 1 as no of row
        for(int i=1 ;i<numRows+1;i++){
             List<Integer> row = new LinkedList<>();
            
             for(int j=0 ;j<i;j++){
                 row.add(1);

                 
             }
             ans.add(row);
             
         



        }
        //1st loop to iteraate through list and 2nd loop to iterate through elemnts in that list to add
        //i is started with 2nd list and definetly in j we dont need to intearct with oth elemnt and last elemnt
  
      
        for (int i = 2; i < numRows; i++){
             for (int j = 1; j < ans.get(i).size() - 1; j++){
                   //setting the list elemnt by getting prev list i-1 and getting the sum of j index and prev index 
                    ans.get(i).set(j, ans.get(i - 1).get(j - 1) + ans.get(i - 1).get(j));
                       }
        }
    return ans;
    }
}