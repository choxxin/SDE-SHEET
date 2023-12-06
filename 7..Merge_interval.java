 class Solution {
    public int[][] merge(int[][] intervals) {
        //short the array based on the 1st no elemnt 
        //here a is the intervals and a[0] is the shorting based on 1st elemnt
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        List<int[]> ans = new ArrayList<>();
        //iterate through intervals and keep ith array in interval array
        for (int i=0 ;i<intervals.length ;i++) {
            int interval [] = intervals[i];
            // if the ans list is empty or the current pair 1st element is greater than prev 
            // pair 2nd element. (then elemnt is not overlapping )
            if (ans.isEmpty() || interval[0] > ans.get(ans.size() - 1)[1]) {
                ans.add(interval);
            } else {
                //(if elemnt is overlapping)
                //get prev pair change the 2nd elemnt by comparing the 2nd elemnt of current pair and that pair .
                //bcz ex:- (1,6),(4,5) ,if we do(1,5) its wrong ,so we compare 6 and 5..
                ans.get(ans.size() - 1)[1] = Math.max(interval[1], ans.get(ans.size() - 1)[1]);
            }
        }
        //we will convert the list ans to arr by .toArray 
         //[ans.size()][2], where each row is a merged interval, and each interval is represented by a subarray of size 2
        return ans.toArray(new int[ans.size()][]);
    }
}
