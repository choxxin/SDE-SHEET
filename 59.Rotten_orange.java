// PAir cointtains the time of every orange 
class Pair{
    int row;
    int col;
    int time;
    Pair(int row,int col,int time){
        this.row=row;
        this.col=col;
        this.time=time;;
    }
}
class Solution {
    public int orangesRotting(int[][] grid) {

            
   int n=grid.length;  
   int m=grid[0].length;


//1)To put the elemnt rotten in our own 2d array in starting 
   Queue<Pair> q = new LinkedList<>();
  int freshcount=0;
   int vis[][]= new int[n][m];
   for(int i =0;i<n ;i++){
      for(int j =0; j<m;j++){
         if(grid[i][j]==2){
            q.add(new Pair(i,j,0));   //simointainously put in queeu
            vis[i][j]=2;
          }

         else {
              vis[i][j]=0;         
            }
        if(grid[i][j]==1){
            freshcount++;       //count all the fresh oranges
        }
      }
    }
    //ans
    int tm=0;  //OUR ans time 
    int drow[]={-1,0,1,0};  //this two array cointains all 4 direction 
    int dcol[]={0,1,0,-1};

    //q 
    int cnt=0;  //to match with freshcount later
    while(!q.isEmpty()){
      int r = q.peek().row;
      int c= q.peek().col;
      int t = q.peek().time;
     tm = Math.max(tm,t);
      q.remove();

     for(int i=0;i<4;i++){
        int nrow=r +drow[i];
        int ncol=c+ dcol[i];
        if(nrow>=0 && nrow<n && ncol>=0 && ncol<m && vis[nrow][ncol]==0 && grid[nrow][ncol]==1){
            q.add(new Pair(nrow,ncol,t+1));  //add only if under boundary if orange in neighbour frsh and not visited in vis
            vis[nrow][ncol]=2;
            cnt++;
        }



     }






    }
    if(cnt!=freshcount) return -1;   //if any freshorange remained at last
    
    return tm;



   






   }











    }
