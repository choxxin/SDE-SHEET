class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int ROW=matrix.length-1;
        int COL=matrix[0].length-1;
        int top=0;
        int bot=ROW;
        //1)applying binary search in the row to find out the row aka#all are shorted
        while(top<=bot){
           int mid=(top+bot)/2;
            if(target<matrix[mid][0]){
                bot=mid-1;

            }
            else if(target>matrix[mid][0]){
                top=mid+1;
            }
            else
            {
                break;  //becouse the condition is <= so it will become a continous loop without this
            }
            
        }
        int row =(top+bot)/2;   //this is the row we found out from above
        int l=0;
        int r=COL;
       //2) by appling binary search in the found row  
        while(l<=r){
            int m=(l+r)/2;
            if(target<matrix[row][m]){
                r=m-1;
            }
            else if(target>matrix[row][m]){
                l=m+1;
            }
            else{
                return true;
            }
        }
        return false;



    }
}