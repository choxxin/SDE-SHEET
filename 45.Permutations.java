
// Example 1:

// Input: nums = [1,2,3]
// Output: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]

class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<Integer> list = new LinkedList<>(); 
        List<List<Integer>> ans = new LinkedList<>();
        int n= nums.length;
        int ref[] = new int [n];
        Arrays.fill(ref,0);  
        backtrack(nums,list ,ans,ref);
        return ans;
    }

    void backtrack(int[] nums,List<Integer> list ,List<List<Integer>> ans ,int ref[]){
        //base case
        if (list.size()==nums.length){
            ans.add(new LinkedList(list));
            return ;
        }

        for(int i=0;i<nums.length;i++){
            if(ref[i]==0){
                list.add(nums[i]);
                ref[i]=1;
                backtrack(nums,list,ans,ref);
                //backtrack
                list.remove(list.size()-1);
                ref[i]=0;
            }
        }
       





    }
}