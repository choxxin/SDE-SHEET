

// User function Template for Java
 
class Solution {
  static class Pair implements Comparable<Pair>{
      int sum,x,y;
      Pair(int sum,int x,int y ){
          this.sum=sum;
          this.x=x;
          this.y=y;
          
      }
      @Override
      public int compareTo(Pair other){
          return Integer.compare(other.sum,this.sum);
      }
  }
    
      static ArrayList<Integer> maxCombinations(int N,int c,int a[],int b[]){
           ArrayList<Integer> list = new ArrayList<>();
          //sort 
          Arrays.sort(a);
          Arrays.sort(b);
          
          PriorityQueue<Pair> heap = new PriorityQueue<>();
          HashSet<String> visit = new HashSet<>();
          
          int n=a.length-1; int m=b.length-1;
          heap.add(new Pair(a[n]+b[m],n,m));
          visit.add(n+" "+m);
          
          
          while(!heap.isEmpty() && list.size()<c){
              Pair curr =heap.poll();
              list.add(curr.sum);
              
              
              int x= curr.x;
              int y=curr.y;
              //Explore 
              
              if(x-1>=0  && !visit.contains((x-1)+" "+y)){
                  heap.add(new Pair(a[x-1]+b[y],x-1,y));
                  visit.add((x-1)+" "+y);
              }
              if(y-1>=0 && !visit.contains(x+" "+(y-1))){
                  heap.add(new Pair(a[x]+b[y-1],x,y-1));
                  visit.add(x+" "+(y-1));
                  
              }

              
              
          }
          
          
          
          
          
          
          return list;
          
          
      }
      
      
      
      
      
      
      
      
      
      
      
      
       
    }