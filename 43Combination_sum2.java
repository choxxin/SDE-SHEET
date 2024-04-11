class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
         List<Integer> list = new LinkedList<>();
         List<List<Integer>> ans = new LinkedList<>();
         rec(candidates,target,0,list,ans);
        return ans;

    }
    public void rec(int [] can,int target ,int idx ,List<Integer> list ,List<List<Integer>> ans){
      //BASE CASE 

      //we need to write this first before the second if ie(target<0 || idx==ca...) bcz we need to add elemt then return from condition
      if(target==0){
          ans.add(new ArrayList(list));
          return ;
      }

      if(target<0 || idx==can.length){
          return;
      }
             
     //appliying rec for all    elements 

      for(int i=idx;i<can.length;i++){

            if(i> idx && can[i]==can[i-1])  continue;  //if same elemnt occurs skip 
                                         //ELSe 
            list.add(can[i]);
            rec(can,target-can[i],i+1,list,ans);
            list.remove(list.size()-1);
      }
      
    }
}