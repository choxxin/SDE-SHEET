class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> q = new ArrayDeque<>();
        int n = nums.length;
        int ans []= new int [n-k+1];   //size of aray would be this for ans always.
        int count=0;  //for index of arr;

        for(int i =0;i<n;i++){
            
            //remove empty out of bound index from starting 
            if(!q.isEmpty() && q.peek()==i-k){
                q.poll();
            }
            //delete smaller elemnt from last
            while(!q.isEmpty() && nums[q.peekLast()]<nums[i]){
                q.pollLast();
            }
            //put elemnt always
            q.offer(i);

            if(i>=k-1){
                   ans[count++]=nums[q.peek()];
            }

   

        }

return ans;
    }
}