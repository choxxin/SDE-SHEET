class Solution {
    //WE ARE going from 2nd last row and col where bottom row and col filled with 1
    //we will always be adding the right and bottom element to find out the no of ways to travel through that cell
    //through this we would find out the no ways by getting the elemnt at 0th row and col;
    public int uniquePaths(int m, int n) {
        int row[]= new int[n]; //as we havent given no physical matrix we are creating a row arr with all value 1 .
        Arrays.fill(row,1);
        for(int i =0;i<m-1;i++){ //to iterrate in rows from last to top
            int newrow[]= new int[n]; //make a new row 
             newrow[n-1]=1;  //fill the 2nd last element with 1
            for(int j=n-2;j>=0;j--){  //from this row we goona add right and bootom element
                newrow[j]=newrow[j+1]+row[j];
            }
            row=newrow; //everytime we will exchange the newrow with row
         
        }
        return row[0];  //the first element in the row arr is always our answer.


    }
}
//TC: O(mxn) SC:O(n)