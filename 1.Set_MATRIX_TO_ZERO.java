class Solution {
    public void setZeroes(int[][] matrix) {
        //m is the row lwngth
        int m =matrix.length;
        //n is the col length
       int n =matrix[0].length;
         //we will take marker which will keep track if there is zero in 0th row or col or not
        int x=1;
        int y=1;
        //check row in 0th row (marker row)
        for(int i=0 ; i<n;i++){
            if(matrix[0][i]==0){
                x=0;
                break;

            }
        }
        //check in 0th col(marker col)
        for(int i=0 ;i<m;i++){
            if(matrix[i][0]==0){
                y=0;
                break;
            }
        }
        //now traverse in inner matrix(matrix eccept 0th row and col) and mark the marker row and col 
        for(int i=1 ;i<m;i++){
            for (int j=1;j<n;j++){
                if(matrix[i][j]==0){
                    matrix[0][j]=0;
                    matrix[i][0]=0;
                }
            }
        }
        //check the row marker and make inner col zero accordingly
        for(int i=1;i<n;i++){
            if(matrix[0][i]==0){
                for(int j=1 ;j<m;j++){
                    matrix[j][i]=0;
                }
            }
        }
        //check the col marker and make inner row zero accordingly
        for(int i=1;i<m;i++){
            if(matrix[i][0]==0){
                for(int j=1;j<n;j++){
                    matrix[i][j]=0;
                }
            }
        } //if any elemnt in row marker make whole row zero 
        if(x==0){
            for(int i=0;i<n ;i++){
                matrix[0][i]=0;
            }
        }
        //similarly for col marker
        if(y==0){
            for(int i=0;i<m;i++){
                matrix[i][0]=0;
            }
        }

    }
}