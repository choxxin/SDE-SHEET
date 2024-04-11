class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i : nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        List<Integer> list = new LinkedList<>(map.keySet());
         list.sort((a,b) -> map.get(b)-map.get(a));
         int arr[] = new int[k];
         for(int i=0;i<k ;i++){
              arr[i]=list.get(i);

         }

    return arr;
    }
}